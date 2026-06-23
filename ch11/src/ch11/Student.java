package ch11;

public class Student extends Person {
	int studentNumber; // サブクラス独自のフィールド

	@Override // オーバーライドの目印
	public void display() { // スーパークラスと同名・同引数のメソッド
		System.out.println("名前: " + this.name);
		System.out.println("学籍番号: " + this.studentNumber);
	}
}