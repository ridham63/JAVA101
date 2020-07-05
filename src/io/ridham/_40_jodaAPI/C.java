package io.ridham._40_jodaAPI;

import java.time.LocalTime;

public class C {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		// To find hour, minutes, seconds and nanoSeconds
		int hh = time.getHour();
		int mm = time.getMinute();
		int ss = time.getSecond();
		int nn = time.getNano();
		
		// To write out in our time format
		System.out.printf("%d:%d:%d:%d", hh, mm, ss, nn);
	}
}
