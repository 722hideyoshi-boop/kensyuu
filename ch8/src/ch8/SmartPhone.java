package ch8;

import java.util.Random;

public class SmartPhone {

	String owner = "ヒデヨシ";
	int battery = 50;
	final int max_battery = 100;

	public void useApp(int minutes) {
		System.out.println(owner + "はアプリを" + minutes + "分使った！バッテリーが減少した！");
		this.battery -= minutes * 2;

	}

	public int charge(int sec) {
		System.out.println(owner + "はスマホを" + sec + "秒間充電した！");
		int recover = new Random().nextInt(3) + 10 + sec;
		int recoverActual = Math.min(this.max_battery - this.battery, recover);
		this.battery += recoverActual;
		return recoverActual;
	}
}
