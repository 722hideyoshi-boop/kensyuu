package ch4;

public class Main_practice_4_4 {

	public static void main(String[] args) {
		int[] numbers = { 3, 4, 9 };
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();

		// 💡 修正ポイント①：アタリかどうかをメモする「フラグ変数」を用意（最初はfalse）
		boolean isHit = false;

		for (int n : numbers) {
			if (n == input) {
				// 💡 修正ポイント②：一致したらメモを「true（アタリ）」に書き換える
				isHit = true;
			}
		}

		// 💡 修正ポイント③：ループが完全に終わった「後」で、最終結果を1つだけ出す
		if (isHit == true) {
			System.out.println("アタリ！");
		} else {
			System.out.println("ハズレ！");
		}
	}
}