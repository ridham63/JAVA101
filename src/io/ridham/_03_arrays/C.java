package io.ridham._03_arrays;

import java.util.Arrays;

public class C {
	public static void main(String[] args) {
		// Two-dimensional array or multi-dimensional array
		int[][] matrix = new int[2][2];

		matrix[0][0] = 0;
		matrix[0][1] = 1;
		matrix[1][0] = 2;
		matrix[1][1] = 3;

		// there is no direct way to find length of multi-dimensional array
		System.out.println(matrix[0].length);

		System.out.println(Arrays.toString(matrix[0]));
		System.out.println(Arrays.toString(matrix[1]));
	}

}
