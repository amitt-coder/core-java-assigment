package com.kaizen.io.ass;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int day = in.nextInt();
		
	//	int day2 = 7;
		
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6 :
			System.out.println("Satarday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			default:
				System.out.println("Not a null value");
		}
		
			
		
	}
}
