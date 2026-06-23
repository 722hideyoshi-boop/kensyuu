package ch8;

public class Main_SmartPhone {

	public static void main(String[] args) {
		System.out.println("----スマホ充電完了----");
		SmartPhone phone = new SmartPhone();

		System.out.println("持ち主: " + phone.owner);
		System.out.println("現在のバッテリー: " + phone.battery + " / " + phone.max_battery);
		System.out.println("--------------------------------");

		phone.useApp(20);
		System.out.println("現在のバッテリー: " + phone.battery);
		System.out.println("--------------------------------");

		int recoveredAmount = phone.charge(5);

		System.out.println("結果：実際に充電できたのは " + recoveredAmount + "% でした。");
		System.out.println("現在の最終バッテリー: " + phone.battery);
		System.out.println("--- シミュレーション終了 ---");
	}

}
