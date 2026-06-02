package ch3;

public class Main_practice_3_3 {

	public static void main(String[] args) {
		// 練習問題3-3
		int isHungry = 0;
		String food = "エビフライ";
		System.out.println("こんにちは");
		if (isHungry == 0) {
			System.out.println("おなかが減っています");
		} else {
			System.out.println("腹ペコです");
		}
		if (isHungry != 0) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした！");
	}

}
