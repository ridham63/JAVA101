package io.ridham._33_lambda;

public class C {
	public static void main(String[] args) {

		Interf2 i = (a, b) -> System.out.println(a+b);
		
		i.add(10, 20);
		i.add(100, 200);
	}
}

//@FunctionalInterface
interface Interf2 {
	public void add(int a, int b);
}
