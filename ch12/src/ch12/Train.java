package ch12;

public class Train extends Vehicle {
	@Override
	public void move() {
		System.out.println(this.name + "は線路を走ります。");
	}
}