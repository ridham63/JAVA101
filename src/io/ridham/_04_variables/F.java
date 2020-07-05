package io.ridham._04_variables;

// uninitialized array
public class F {
	int[] x;

	public static void main(String[] args) {
		F f1 = new F();
		System.out.println(f1.x);		// null
		System.out.println(f1.x[0]);	// NPE
	}
}
