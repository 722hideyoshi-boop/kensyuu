package ch4;

public class Main4_4_15 {

	public static void main(String[] args) {
		// 配列の舞台裏
		int[] arrayA = { 1, 2, 3 };
		int[] arrayB;
		arrayB = arrayA;
		arrayB[0] = 100;
		System.out.println(arrayA[0]);

	}

}
