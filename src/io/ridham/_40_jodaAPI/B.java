package io.ridham._40_jodaAPI;

import java.time.LocalDate;

public class B {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		// To find date, month and year
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		
		// To write out in our date format
		System.out.printf("%d-%d-%d", dd, mm, yyyy);
	}
}
