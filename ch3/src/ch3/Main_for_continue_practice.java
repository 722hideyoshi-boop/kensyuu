package ch3;

public class Main_for_continue_practice {

	public static void main(String[] args) {
		// for文のbreakを練習してみる
		for (int i = 1; i < 10; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}

	}

}
