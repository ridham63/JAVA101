package io.ridham._39_methodReference;

// :: is used for method reference and constructor reference
public class A {
	// we can use lambada expression to give implementation to m1()
	public static void main(String[] args) {
		Interf i = () -> {
			System.out.println("lambada implementation");
		};
		i.m1();
	}
}
