package ch11;

// Vehicle（親）を「継承（extends）」し、FarePayable（インターフェース）を「実装（implements）」する
public class Taxi extends Vehicle implements FarePayable {

	// 1. run() メソッドは親クラスから引き継いでいるので、ここに書かなくても自動で持っている！

	// 2. インターフェースと契約を結んだので、payFare メソッドを「絶対に」オーバーライドして中身を作らなければいけない
	@Override
	public void payFare() {
		System.out.println("メーターの金額を支払いました。");
	}
}