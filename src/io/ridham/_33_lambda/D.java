package io.ridham._33_lambda;

public class D {
	public static void main(String[] args) {
		
		Interf3 i = s -> s.length();
		
		System.out.println(i.getLength("Ridham"));
		System.out.println(i.getLength("Java"));		
	}
}

//@FunctionalInterface
interface Interf3 {
	public int getLength(String s);
}
