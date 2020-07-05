package io.ridham._35_defaultStatic;

// static methods inside interface
// general utility methods defined inside interface as static methods

// interface and static elements not related to objects
// so static methods should declared inside interface

// we can't override static methods of interface
// so we can create static/ instance method of same method signature(act as separate method)
// this method can be instance as it is separate method
// we can reduce scope of method inside implementation class as it is not overriding
public class C implements Z1 {
	public static void main(String[] args) {
		// you can call interface static methods by interface reference only
		Z1.m1();
	}
}

interface Z1 {
	public static void m1() {
		System.out.println("static method");
	}
}