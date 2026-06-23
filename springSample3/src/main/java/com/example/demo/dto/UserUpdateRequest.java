package com.example.demo.dto;

import java.io.Serializable;

import jakarta.validation.constraints.NotNull; // 💡 javaxからjakartaへ

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ユーザー情報更新リクエストデータ
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserUpdateRequest extends UserRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * ユーザーID
	 */
	@NotNull(message = "IDを入力してください") // 💡 メッセージを追加するとより親切です
	private Long id;
}