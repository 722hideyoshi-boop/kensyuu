package ch12;

public class Main多態 {
	public static void main(String[] args) {

		// ★ここが多態性の核心！
		// 左辺の型は親の「Vehicle」なのに、右辺のインスタンスは子の「Taxi」や「Train」
		Vehicle v1 = new Taxi();
		Vehicle v2 = new Train();

		v1.name = "個人タクシー";
		v2.name = "山手線";

		// 全く同じメソッドを呼び出す
		v1.move();
		v2.move();
	}
}