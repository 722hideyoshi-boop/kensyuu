package report;

public class MainReport {
	public static void main(String[] args) {

		//1.カプセル化
		Hero h = new Hero();
		h.setName("ミナト");
		h.setHp(150);

		//2.多態性の検証
		//★多態性：親クラスである「Character型」の変数に、子クラスの「Heroインスタンス」を代入する。
		Character c = h;

		System.out.println("---行動開始---");
		c.specialAttack(); //Character型の変数からメソッドを呼び出す。
	}

}
