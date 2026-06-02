package ch3;

public class Main3_3_1_kari {

	public static void main(String[] args) {
		// 天気による行動の変化を条件分岐で表す
		boolean tenki = new java.util.Random().nextBoolean();
		if (tenki == true) {
			System.out.println("選択をします");
			System.out.println("散歩に行きます");
		} else {
			System.out.println("DVDを見ます");

		}

	}

}
