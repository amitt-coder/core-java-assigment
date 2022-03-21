package com.controlstatement;

public class ValueCheck {
	public static void main(String[] args) {
		
		int day = 5;
		
		if(day == 1) {
			System.out.println("Monday");
		} else if(day ==2) {
			System.out.println("Tue");
		} else if(day == 3) {
			System.out.println("Wed");
		} else if(day == 4) {
			System.out.println("Th");
		} else if(day == 5) {
			System.out.println("Fr");
		}  else if(day == 6) {
			System.out.println("Sat");
		} else if(day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Not valid a day");
		}
	}
}
