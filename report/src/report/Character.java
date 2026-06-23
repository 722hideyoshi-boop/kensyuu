package report;

public abstract class Character {
	//★カプセル化：privateをつけて、外部クラスから書き換えられるのを防ぐ。
	private String name;
	private int hp;

	//カプセル化されたフィールドを安全に読み書きするための「getter/setter」
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
			this.hp = hp;
		}

	}

	//抽象メソッド(子クラスにオーバーライドを強制する。)
	public abstract void specialAttack();
}
