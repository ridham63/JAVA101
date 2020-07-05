package io.ridham._33_lambda;

// Functional interfaces contain only one method

//@FunctionalInterface
interface Interf1 {
	public abstract void m1();
}

// purpose of functional interface is to call lambada expression
public class B {
	public static void main(String[] args) {
		// Using this we can implement and override interface method
		Interf1 i = () -> System.out.println("Hello");
		
		i.m1();
	}
}
