package report2;

public class Main_2 {
	public static void main(String[] args) {

		Fighter_2 f = new Fighter_2();

		f.setName("アルス");
		f.setHp(-50); // あえて不正なマイナスの値を送ってみる

		System.out.println("名前: " + f.getName());
	}
}