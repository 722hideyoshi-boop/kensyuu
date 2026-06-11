package ch11;

public class Main_gemini {
	public static void main(String[] args) {
		System.out.println("====== 🍄 決戦！マタンゴの森 💃 ======");

		// 1. 登場人物（インスタンス）の生成
		Dancer dancer = new Dancer();
		dancer.name = "アサカ";
		dancer.hp = 100;

		Matango matangoA = new Matango('A');
		Matango matangoB = new Matango('B');

		System.out.println("ダンサーの " + dancer.name + " が現れた！ (HP:" + dancer.hp + ")");
		System.out.println("キノコA (HP:" + matangoA.hp + ") と キノコB (HP:" + matangoB.hp + ") が行く手を阻む！");
		System.out.println("----------------------------------------\n");

		// 2. バトル開始！
		// ターン1：アサカのターン（まずは普通に攻撃）
		System.out.println("【ターン1】");
		dancer.attack(matangoA);
		System.out.println("キノコAの残りHP: " + matangoA.hp + "\n");

		// ターン2：キノコAの逆襲
		System.out.println("【ターン2】");
		matangoA.attack(dancer);
		System.out.println("アサカの残りHP: " + dancer.hp + "\n");

		// ターン3：アサカ、情熱の舞から必殺のハメ技
		System.out.println("【ターン3】");
		dancer.dance();

		System.out.println("\n--- 💥 アサカは踊り狂いながらマタンゴBを滅多打ちにした！ ---");
		// 抽象メソッドで義務付けられたattackをここぞとばかりに連打！
		dancer.attack(matangoB);
		dancer.attack(matangoB);
		dancer.attack(matangoB);
		System.out.println("キノコBの残りHP: " + matangoB.hp + "\n");

		// 3. 決着
		System.out.println("========================================");
		System.out.println("キノコBは力尽きた！アサカは華麗に勝利のステップを踏んだ！");
	}
}