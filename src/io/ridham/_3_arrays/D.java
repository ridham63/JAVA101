package io.ridham._3_arrays;

import java.util.Arrays;

public class D {
	public static void main(String[] args) {
		Number[] n = new Number[3];

		n[0] = new Integer(10);
		n[1] = new Long(20L);
		// Array can store value of declare type and its sub-class
//		n[2] = new String("str");
		System.out.println(Arrays.toString(n));

		// Interface array can store its implemented classes
		// Here runnable can have classes which implemented Runnable(I)
		Runnable[] r = new Runnable[2];
		r[0] = new Thread();
//		r[1] = new String();
	}
}
