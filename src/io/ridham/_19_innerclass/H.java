package io.ridham._19_innerclass;

// Method local inner class
// Class defined inside a method is called method local inner class

// Applicable modifiers are:
// abstract, final, strictfp

// Method local inner class can be defined inside static / instance method
// But if method local inner class defined inside static method, it can't access instance declaration
public class H {
	public void m1() {
		class Hi {
			public void sum(int x, int y) {
				System.out.println("Sum is : "  + (x+y));
			}
		}
		Hi i = new Hi();
		i.sum(10, 20);
		i.sum(100, 200);
		i.sum(1000, 2000);
	}
	
	public static void main(String[] args) {
		H h = new H();
		h.m1();
	}
}
