package ch11;

public class Vehicle {
	String name; // フィールドを引き継がせる

	public void run() { // 処理の中身もそのまま引き継がせる
		System.out.println("アクセルを踏んで前進します。");
	}
}