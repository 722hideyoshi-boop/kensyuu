package report2;

class Fighter_2 {
	
	private String name;
	private int hp;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			// もしマイナスの不正な値が来たら、強制的に 0 に補正する
			this.hp = 0;
		} else {
			this.hp = hp;
		}
	}
}