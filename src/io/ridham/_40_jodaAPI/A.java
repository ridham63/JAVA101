package io.ridham._40_jodaAPI;

import java.time.*;

// Joda time API
// There were time classes/interfaces before but its not very useful
public class A {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println(date);
		System.out.println(time);

	}
}
