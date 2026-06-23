package ch6;

import ch5.CalcLogic;
//★ここがimport文！！
//「ch5パッケージにある、CalcLogicクラスをインポートします。」という意味。
//これを書くことで、このっファイル内では「ch5」を省略して「CalcLogic」と書くだけでよくなる。

public class Main_Import {
	//クラスの名前が「Main_Import」であることを宣言している。

	public static void main(String[] args) {
		int a = 10;
		int b = 2;

		int total = CalcLogic.tasu(a, b);
		//3行目でimportしているので、まるで同じパッケージにいるかのようにクラス名だけで直接呼び出せる。

		System.out.println("インポートで足すと" + total);
	}
}
