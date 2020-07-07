package io.ridham._04_variables;

// uninitialized array
public class F {
	int[] x1;
	int[] x2 = new int[3];
	
	static int[] x3;
	static int[] x4 = new int[3];

	public static void main(String[] args) {
		
		int[] x5;
		int[] x6 = new int[3];
		
		F f1 = new F();
		System.out.println(f1.x1);		// null
		System.out.println(f1.x1[0]);	// NPE
		
		System.out.println(f1.x2);		// [I@15db9742
		System.out.println(f1.x2[0]);	// 0
		
		System.out.println(x3);			// null
		System.out.println(x3[0]);		// NPE
		
		System.out.println(x4);			// [I@15db9742
		System.out.println(x4[0]);		// 0
		
//		System.out.println(x5);			// x5 may not have been initialized
//		System.out.println(x5[0]);		// x5 may not have been initialized
		
		System.out.println(x6);			// [I@15db9742
		System.out.println(x6[0]);		// 0
	}
}
