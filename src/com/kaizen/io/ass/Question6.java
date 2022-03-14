package com.kaizen.io.ass;

import java.util.Date;
import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		
		Date date = new Date();
		int hour = date.getHours();
		int min =date.getMinutes();
		
		System.out.printf("Toatal minutes: " + (hour*60+min) , date);
		
		
				
		
	}
}
