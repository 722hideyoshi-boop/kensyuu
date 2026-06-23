package ch3;

public class Main3_3_3 {

	public static void main(String[] args) {
		// if else if else
		int height = new java.util.Random().nextInt(200);
		String size;
		if (height >= 170) {
			size = "L";
		} else if (height >= 155) {
			size = "M";
		} else if (height >= 140) {
			size = "S";
		} else {
			size = "?";
		}

		System.out.println(size);

	}

}
