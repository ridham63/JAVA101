package io.ridham._10_accessModifier.pack2;

import io.ridham._10_accessModifier.pack1.A;

public class C extends A {
	public static void main(String[] args) {
		A a = new A();
//		a.m1();
		C c = new C();
		c.m1();
		A a1 = new C();
//		a1.m1();
	}
}

class D extends C {
	public static void main(String[] args) {
		A a = new A();
//		a.m1();
		C c = new C();
//		c.m1();
		D d = new D();
		d.m1();
		A a1 = new C();
//		a1.m1();
		A a2 = new D();
//		a2.m1();
		C c1 = new D();
//		c1.m1();
	}
}