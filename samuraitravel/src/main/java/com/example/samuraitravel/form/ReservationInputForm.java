package com.example.samuraitravel.form;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ReservationInputForm {

	// HTMLの name="fromCheckinDateToCheckoutDate" と一致させる
	@NotBlank(message = "チェックイン日とチェックアウト日を選択してください。")
	private String fromCheckinDateToCheckoutDate;

	@NotNull(message = "宿泊人数を入力してください。")
	private Integer numberOfPeople;

	// 「から」で区切って LocalDate に変換する処理をここで完結させる
	public LocalDate getCheckinDate() {
		try {
			if (fromCheckinDateToCheckoutDate == null || !fromCheckinDateToCheckoutDate.contains(" から ")) {
				return null;
			}
			// 文字列の「2026-06-22 から 2026-06-25」を分割して最初を返す
			return LocalDate.parse(fromCheckinDateToCheckoutDate.split(" から ")[0]);
		} catch (Exception e) {
			return null;
		}
	}

	public LocalDate getCheckoutDate() {
		try {
			if (fromCheckinDateToCheckoutDate == null || !fromCheckinDateToCheckoutDate.contains(" から ")) {
				return null;
			}
			// 文字列の「2026-06-22 から 2026-06-25」を分割して2番目を返す
			return LocalDate.parse(fromCheckinDateToCheckoutDate.split(" から ")[1]);
		} catch (Exception e) {
			return null;
		}
	}
}