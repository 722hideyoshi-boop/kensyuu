package report2;

public class Main {
	public static void main(String[] args) {

		// ★多態性の核心
		// 左辺は親クラス（Fighter型）の変数なのに、右辺は子クラスのインスタンス
		Fighter f1 = new Hero();
		Fighter f2 = new Wizard();

		// 親から引き継いだフィールドにアクセス
		f1.name = "アルス";
		f2.name = "マリベル";

		System.out.println(f1.name + "の行動：");
		// ★全く同じ型の変数から、全く同じメソッドを呼び出す
		f1.attack();

		System.out.println(f2.name + "の行動：");
		// ★こちらもコード上の見た目は完全に同じ呼び出し
		f2.attack();
	}
}