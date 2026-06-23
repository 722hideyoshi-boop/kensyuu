package ch4;

public class Main4_4_12 {

	public static void main(String[] args) {
		// 添え字[i]に対応した情報の利用
		int[] seq = new int[10];

		//塩基配列をランダムに生成
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);

		}

		//生成した塩基配列の記号を表示
		for (int i = 0; i < seq.length; i++) {
			char[] base = { 'A', 'T', 'G', 'C' };
			System.out.println(base[seq[i]] + "");

		}
	}
}