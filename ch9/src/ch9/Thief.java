package ch9;

public class Thief {
	String name;
	int hp;
	int mp;

	//1.3つの引数を持つコンストラクタ
	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	//2.2つの引数を持つコンストラクタ
	public Thief(String name, int hp) {
		this(name, hp, 5);
	}

	//3.1つの引数を持つコンストラクタ
	public Thief(String name) {
		this(name, 40, 5);
	}

}
