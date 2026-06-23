package ch11;

public class Mainインターフェース {
	public static void main(String[] args) {
		Taxi t = new Taxi();
		t.name = "個人タクシー";

		t.run(); // ① extends で手に入れたメソッド
		t.payFare(); // ② implements で手に入れたメソッド
	}
}