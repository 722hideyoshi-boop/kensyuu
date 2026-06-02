package ch3;

public class Main_3_3_2 {

	public static void main(String[] args) {
		// 条件に当てはまる場合は繰り返し文
		boolean doorClose = new java.util.Random().nextBoolean();
		while (doorClose == true) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
		}
	}

}
