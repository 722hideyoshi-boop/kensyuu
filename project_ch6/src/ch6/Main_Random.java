package ch6;
//このクラスは「ch6」というパッケージに所属していることを宣言しています。

import java.util.Random;
//★ここがRandomのインポートです！！！
//「java.utilパッケージにあるRandomクラスをインポートします」という意味です。
//これを書くことで、このファイル内では「java.util.」を省略できるようになります。

public class Main_Random {
	//クラスの名前が「Main_Random」であることを宣言しています。

	public static void main(String[] args) {
		Random rand = new Random();
		//★インポートしているので、いきなり「Random」と書けています。
		//ランダムな機能を持ったインスタンスを新しく作って、変数randに入れています。

		int num = rand.nextInt(10);
		//randの中から0～9までのランダムな整数を1つ取り出す。「nextInt」というメソッドを呼び出しています。

		System.out.println("ランダムな数字：" + num);
	}
}
