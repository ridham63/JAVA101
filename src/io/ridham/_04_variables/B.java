package io.ridham._04_variables;

// Instance variable defined inside class and outside method or block
// This variables don't have static modifier
// Value of each variable varies from object to object
// Instance variable created at the time of object creation
// It stored in heap memory
// it's also called object level variable or attribute
// Not thread-safe
public class B {

	// initialization of instance variable is optional
	// if not initialized, it will get their default value
	int x = 10;

	// static context can't access instance field directly
	public static void main(String[] args) {
//		System.out.println(x);
		B b = new B();
		System.out.println(b.x);
		b.m1();
	}

	// instance context can access instance field directly
	public void m1() {
		System.out.println(x);
	}
}
