package com.example.samuraitravel.service;

import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.samuraitravel.form.ReservationRegisterForm;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Event;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;
import com.stripe.param.checkout.SessionRetrieveParams;

@Service
public class StripeService {
	@Value("${stripe.api-key}")
	private String stripeApiKey;

	private final ReservationService reservationService;

	public StripeService(ReservationService reservationService) {
		this.reservationService = reservationService;
	}

	public String createStripeSession(String houseName, ReservationRegisterForm reservationRegisterForm,
			HttpServletRequest httpServletRequest) {
		Stripe.apiKey = stripeApiKey;
		String requestUrl = new String(httpServletRequest.getRequestURL());
		SessionCreateParams params = SessionCreateParams.builder()
				.addPaymentMethodType(SessionCreateParams.PaymentMethodType.CARD)
				.addLineItem(
						SessionCreateParams.LineItem.builder()
								.setPriceData(
										SessionCreateParams.LineItem.PriceData.builder()
												.setProductData(
														SessionCreateParams.LineItem.PriceData.ProductData.builder()
																.setName(houseName)
																.build())
												.setUnitAmount((long) reservationRegisterForm.getAmount())
												.setCurrency("jpy")
												.build())
								.setQuantity(1L)
								.build())
				.setMode(SessionCreateParams.Mode.PAYMENT)
				.setSuccessUrl(
						requestUrl.replaceAll("/houses/[0-9]+/reservations/confirm", "") + "/reservations?reserved")
				.setCancelUrl(requestUrl.replace("/reservations/confirm", ""))
				.setPaymentIntentData(
						SessionCreateParams.PaymentIntentData.builder()
								.putMetadata("houseId", reservationRegisterForm.getHouseId().toString())
								.putMetadata("userId", reservationRegisterForm.getUserId().toString())
								.putMetadata("checkinDate", reservationRegisterForm.getCheckinDate())
								.putMetadata("checkoutDate", reservationRegisterForm.getCheckoutDate())
								.putMetadata("numberOfPeople", reservationRegisterForm.getNumberOfPeople().toString())
								.putMetadata("amount", reservationRegisterForm.getAmount().toString())
								.build())
				.build();
		try {
			Session session = Session.create(params);
			return session.getId();
		} catch (StripeException e) {
			e.printStackTrace();
			return "";
		}
	}

	public void processSessionCompleted(Event event) {
		System.out.println("DEBUG: processSessionCompleted に到達しました");

		// 1. JSONから "id":"..." の値を正確に抜き出す
		// キー "id" に続くダブルクォーテーションで囲まれた値全体を取得
		String sessionId = null;
		String rawJson = event.getDataObjectDeserializer().getRawJson();

		try {
			// "id":" の後ろから始まる文字列を取得
			String idKey = "\"id\":\"";
			int startIndex = rawJson.indexOf(idKey) + idKey.length();
			int endIndex = rawJson.indexOf("\"", startIndex);
			sessionId = rawJson.substring(startIndex, endIndex);

			System.out.println("DEBUG: 抽出成功。セッションID: " + sessionId);
		} catch (Exception e) {
			System.err.println("DEBUG: ID抽出失敗。JSON構造を確認してください。");
			return;
		}

		try {
			// 2. Stripe API を叩いて最新情報を取得
			Stripe.apiKey = stripeApiKey;
			SessionRetrieveParams params = SessionRetrieveParams.builder().addExpand("payment_intent").build();
			Session retrievedSession = Session.retrieve(sessionId, params, null);

			// 3. メタデータを取得してデータベースへ
			Map<String, String> metadata = retrievedSession.getPaymentIntentObject().getMetadata();

			reservationService.create(metadata);
			System.out.println("DEBUG: 保存処理完了");

		} catch (Exception e) {
			System.err.println("DEBUG: セッション取得または保存中にエラーが発生しました");
			e.printStackTrace();
		}
	}
}
