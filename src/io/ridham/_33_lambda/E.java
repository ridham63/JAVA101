package io.ridham._33_lambda;

public class E {
	public static void main(String[] args) {

		Interf4 i = x -> x*x;
		
		System.out.println(i.getSquare(5));
		System.out.println(i.getSquare(7));		
	}
}

//@FunctionalInterface
interface Interf4 {
	public int getSquare(int x);
}
