package io.ridham._40_jodaAPI;

import java.time.Year;
import java.util.Scanner;

public class G {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Please enter a Year : ");
		int n = scn.nextInt();

		// Year is used to get year object from int
		Year y = Year.of(n);

		// isLeap() --> built-in method to chaeck if current year is leap year or not
		if (y.isLeap())
			System.out.printf("\nYear %d is leap year", n);
		else
			System.out.printf("\nYear %d isn't leap year", n);
		scn.close();
	}
}
