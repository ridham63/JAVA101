package io.ridham._40_jodaAPI;

import java.time.LocalDateTime;

public class D {
	public static void main(String[] args) {

		// If we want to use date and time at a same we can use LocalDateTime
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		// All methods are same for get individual format
		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yyyy = dt.getYear();
		System.out.printf("%d-%d-%d", dd, mm, yyyy);

		int hh = dt.getHour();
		int m = dt.getMinute();
		int ss = dt.getSecond();
		int nn = dt.getNano();
		System.out.printf("\n%d:%d:%d:%d", hh, m, ss, nn);
	}
}
