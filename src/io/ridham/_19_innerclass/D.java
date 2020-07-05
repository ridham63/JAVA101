package io.ridham._19_innerclass;

// How to access inner class from outer class static context
public class D {

	class Di{	
		public void m1() {
			System.out.println("Inner class method");
		}		
	}
	
	// instance context
	public void m2() {
		Di i = new Di();
		i.m1();
	}
	
	public static void main(String[] args) {
		D d = new D();
		d.m2();
	}
	
}
