package io.ridham._19_innerclass;

// Static nested class
// Some time we can declare inner class with static modifiers
// Static inner class can exist without outer class
// So it don't have strong association with outer class like normal inner class
public class M {
	int x = 100;
	static int y = 200;

	// Inside static inner clas we can have static declaration
	// But from static nested class we can't access instance context
	static class Mi {
		public void m1() {
			System.out.println("Static nested class");
			// System.out.println(x);
			System.out.println(y);
		}
		
		// static inner class can have main method
		public static void main(String[] args) {
			
		}
	}

	public static void main(String[] args) {
		// We are not required to instantiate outer class
		Mi mi = new Mi();
		mi.m1();

		// or

		M.Mi m = new M.Mi();
		m.m1();
	}
}