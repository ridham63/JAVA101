package io.ridham._40_jodaAPI;

import java.time.LocalDateTime;
import java.time.Month;

public class E {
	public static void main(String[] args) {
		// You can make instance of specific date or time
		// of() has many OverLoaded methods
		LocalDateTime bd = LocalDateTime.of(1996, Month.JANUARY, 15, 10, 30);
		System.out.println(bd);

		// You can add or subtract time to any time instance
		System.out.println("After six months : " + bd.plusMonths(6));
		System.out.println("After 24 years : " + bd.plusYears(24));
	}
}
