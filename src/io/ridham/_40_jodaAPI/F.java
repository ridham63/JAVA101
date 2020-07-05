package io.ridham._40_jodaAPI;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class F {
	public static void main(String[] args) {
		LocalDate bd = LocalDate.of(1996, Month.JANUARY, 15);
		LocalDate today = LocalDate.now();
		LocalDate dd = LocalDate.of(1996 + 60, Month.JANUARY, 15);

		// Period is used to find length of time
		// between() is used to find time between to time instances
		Period p = Period.between(bd, today);

		System.out.printf("You are %d Years, %d Months and %d days old.",
				p.getYears(), p.getMonths(), p.getDays());

		
		Period p1 = Period.between(today, dd);
		int d = p1.getYears() * 365 + p1.getMonths() * 12 + p1.getDays();

		System.out.printf("\nYou are on earth for only %d days old,"
				+ " hurry up to do important things", d);

	}
}
