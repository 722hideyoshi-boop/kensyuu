package ch9;

public class Main {
	public static void heal(int hp) {
		hp += 10;
		System.out.println(hp);
	}

	public static void heal(Thief thief) {
		thief.hp += 10;
	}

	public static void main(String[] args) {
		int baseHP = 25;
		Thief t = new Thief("アサカ", baseHP);
		System.out.println(baseHP + ":" + t.hp);
		heal(baseHP);
		heal(t);
		System.out.println(baseHP + ":" + t.hp);

	}
}
