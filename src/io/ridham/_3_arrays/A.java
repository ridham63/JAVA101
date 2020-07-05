package io.ridham._3_arrays;

import java.util.Arrays;

// In java arrays are treated as objects
// Array is indexed collection of fixed number of homogeneous data collection
public class A {
	public static void main(String[] args) {
		
		// Array declaration
		// Cann't specify size at a time of declaration
		String[] s;
		
		// Array creation
		// Size must be fixed and known before, so compiler can allot memory
		// Size must be positive, non-zero and int type(can be typecast to int)
		s = new String[5];
		
		// Array initialization
		// Before initialization, all elements have their default value
		s[0] = "Zero";
		s[1] = "One";
		s[2] = "Two";
		s[3] = "Three";
		// if defined index is not initialized, index will be empty(at default value)
		// this will waste allocated memory
		s[4] = null;
		
		// Arrays class's toString() will create array object to string
		System.out.println(Arrays.toString(s));
		
		// defined, created and initialed at a same line
		int[] x = {0, 1, 2 , 3, 4};
		
		//Error: possible lossy conversion from long to int
//		x[0] = 10L;

		// ArrayIndexOutOfBoundsException will be thrown
		// We trying to access element which is not defined in array
//		s[5] = "";

		// NullPointerException will thrown if null index ever processed
//		s[4].getBytes();

		System.out.println(Arrays.toString(x));
	}
}
