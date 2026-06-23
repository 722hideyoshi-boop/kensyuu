package ch8;

import java.util.Random;

public class Crelic {

	String name = "ひでよし";
	int hp = 50;
	final int max_hp = 50;
	int mp = 10;
	final int max_mp = 10;

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.hp = this.max_hp;
		this.mp -= 5;
		System.out.println("HPが最大まで回復した！");

	}

	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間、天に祈った！");

		//論理上の回復量を乱数を用いて計算する
		int recover = new Random().nextInt(3) + sec;

		//実際の回復量を計算する
		int recoverActual = Math.min(this.max_mp - this.mp, recover);

		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;

	}
}
