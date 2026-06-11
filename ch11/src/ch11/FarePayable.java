package ch11;

public interface FarePayable {
	// インターフェースの中には、フィールド（変数）は書けない（基本的には）
	// メソッドも、中身の波カッコ { } は絶対に書けず、セミコロン ; で終わらせるルール
	public void payFare();
}