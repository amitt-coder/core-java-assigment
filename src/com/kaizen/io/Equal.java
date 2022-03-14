package com.kaizen.io;

import java.util.Date;

public class Equal {
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.printf("%tT%n", date);
	
		System.out.printf("hour %tH: minutus %tM : second %tS%n", date, date, date);
		
		System.out.printf("%1$tH:%1$tM %1$tS %1$tp %1$tN %1$tz %n", date);
	
		System.out.printf("%1$tA, %1$td %1$tY %n", date);
	}
}
