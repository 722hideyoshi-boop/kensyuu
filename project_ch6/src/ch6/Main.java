package ch6;

public class Main {

	public static void main(String[] args) {
		// 同じch6パッケージに属している
		int a = 10;
		int b = 2;

		//同じパッケージ(ch6)の中なので、「クラス名.メソッド名」だけで直接呼び出せます！
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "引くと" + delta);

	}

}
