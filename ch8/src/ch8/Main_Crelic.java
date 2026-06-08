package ch8;

public class Main_Crelic {
	public static void main(String[] args) {

		System.out.println("--- ゲーム開始 ---");

		// 1. クラス（設計図）からインスタンス（実体）を作る！
		// これでメモリ上に「ひでよし」という聖職者が誕生します。
		Crelic priest = new Crelic();

		// 2. 最初の一歩：初期ステータスを確認してみる
		System.out.println("現在の名前: " + priest.name);
		System.out.println("現在のHP: " + priest.hp + " / " + priest.max_hp);
		System.out.println("現在のMP: " + priest.mp + " / " + priest.max_mp);
		System.out.println("--------------------------------");

		// 3. ダメージを受けたと仮定して、HPを減らしてみる
		priest.hp = 10;
		System.out.println(priest.name + "は激しい攻撃を受け、HPが " + priest.hp + " になった！");

		// 4. selfAid() メソッド（回復魔法）を呼び出す！
		priest.selfAid();
		System.out.println("魔法使用後のHP: " + priest.hp); // 50に回復している
		System.out.println("魔法使用後のMP: " + priest.mp); // ※バグのせいで15に増えてしまう
		System.out.println("--------------------------------");

		// 5. pray(int sec) メソッド（祈り）を呼び出す！
		// 引数（条件）として「3秒」を渡します。
		// このメソッドは「実際の回復量」を戻り値として返してくるので、変数で受け取ります。
		int recoveredAmount = priest.pray(3);

		System.out.println("結果：実際に回復したMPは " + recoveredAmount + " でした。");
		System.out.println("現在の最終MP: " + priest.mp);
		System.out.println("--- ゲーム終了 ---");
	}
}