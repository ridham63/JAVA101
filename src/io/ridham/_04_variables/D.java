package io.ridham._04_variables;

public class D {
	static int x = 10;
	int y = 20;

	public static void main(String[] args) {
		D d1 = new D();
		d1.x = 888;
		d1.y = 999;
		D d2 = new D();
		// as static variable create one copy, its value can be changed in static/instance context
		System.out.println(d2.x+"..."+d2.y);
	}
}
