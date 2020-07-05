package io.ridham._03_arrays;

public class B {
	public static void main(String[] args) {
		String s = "string";
		int[] a = {0, 1, 2, 3};

		// length() is final method for string present in java.lang.String
		System.out.println(s.length());

		// length is final variable for arrays
		System.out.println(a.length);

		// if we need array for temporary/instant use, we could use anonymous array
		// when array is created with no reference variable it called 'Anonymous array'
		System.out.println(new char[] {'a', 'b', 'c'});
	}
}
