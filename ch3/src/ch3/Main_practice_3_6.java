package ch3;

public class Main_practice_3_6 {

	public static void main(String[] args) {
		// 練習問題3-6
		System.out.println("【数当てゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for (int i = 0; i < 5; i++) {
			System.out.println("0～9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == ans) {
				System.out.println("アタリ！");
				break;
			}
			if (num != ans) {
				System.out.println("違います！");
			}
		}
		System.out.println("ゲームを終了します！！");
	}

}
