package ch4;

public class Main4_4_11 {

	public static void main(String[] args) {
		// 50点以上の科目の数を調べる
		int[] scores = { 20, 30, 40, 50, 80 };
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 50) {
				count++;
			}
		}
		System.out.println("50点以上の科目の数は：" + count);

	}

}
