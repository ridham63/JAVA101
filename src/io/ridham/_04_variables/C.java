package io.ridham._04_variables;

// Static variable defined inside class and outside method or block
// This variables have static modifier
// Value of each variable is same as only one copy created
// Static variable created at the time of class loading and destroyed at time of class unloading
// It stored in method area
// it's also called class level variable or fields

/*
* 	Start JVM
* 	Create and start main thread
* 	locate .class file
* 	load .class file (here static variable created)
* 	Execute main()
* 	unload .class file (here static variable destroyed)
* 	terminate main thread
* 	shutdown JVM
* */
public class C {

	// initialization of static variable is optional
	// if not initialized, it will get their default value
	static int x = 10;

	// static and instance context can access instance field directly
	public static void main(String[] args) {
		System.out.println(x);
		System.out.println(C.x);
		C c = new C();
		System.out.println(c.x);
		c.m1();
	}

	public void m1() {
		System.out.println(x);
	}
}

