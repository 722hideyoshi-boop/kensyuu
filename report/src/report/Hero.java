package report;

//★継承：extendsを使って、Characterクラスの能力(フィールドやメソッド)を引き継ぐ。
public class Hero extends Character {

	public void specialAttack() {
		//親のprivateフィールドには直接アクセスできないため、getter経由で名前を読む。
		System.out.println(this.getName() + "の必殺技：スーパーアタック！");
	}

}
