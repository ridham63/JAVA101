package io.ridham._3_arrays;

public class E {
	public static void main(String[] args) {
		int[] i = {1, 2, 3};
		char[] ch = {'a', 'b', 'c'};

		// char can be promoted to int(auto widening)
		// but char[] can't be promoted to int[]
//		int[] x = ch;

		// Objects can be promoted to parent classes
		String[] s = {"String1", "String2", "String3"};
		Object[] o = s;
	}
}
