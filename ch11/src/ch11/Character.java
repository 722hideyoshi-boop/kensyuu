package ch11;

public abstract class Character {
	String name;
	int hp;

	//逃げる
	public void run() {
		System.out.println(this.name + "逃げ出した");
	}

	//戦う
	public abstract void attack(Matango m);
}
