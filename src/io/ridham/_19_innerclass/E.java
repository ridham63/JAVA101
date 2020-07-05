package io.ridham._19_innerclass;

// How to access inner class from outside of outer class
public class E {

	class Ei {
		public void m1() {
			System.out.println("Inner class method");
		}
	}

}

// Another class
class Test {
	public static void main(String[] args) {
		D d = new D();
		D.Di i = d.new Di();
		i.m1();
	}
}