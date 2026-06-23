package ch6;

public class Main_Fqcn {
	//クラスの名前がMain_Fqcnであることを宣言している

	public static void main(String[] args) {
		//メインメソッド

		int a = 10;
		int b = 2;

		int total = ch5.CalcLogic.tasu(a, b);
		//ここがFQCN(完全限定クラス)です！！
		//「ch5パッケージにある、CalcLogicクラスの、tasuメソッド」と住所をフルネームで指定して呼び出している
		//計算されて戻ってきた結果(12)を、変数totalに代入している。

		System.out.println("足すと" + total);

	}

}
