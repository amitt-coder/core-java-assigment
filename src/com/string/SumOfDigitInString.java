package com.string;

import java.util.Scanner;

public class SumOfDigitInString {
	
	
	public static int sumOfdigit(String number) {
		
		int sum =0;
		
		for(int i=0;i<number.length()-1;i++) {
			
		char ch = number.charAt(i);
		
		if(Character.isDigit(ch)) {
			
			
		int n = Character.getNumericValue(ch);
		
		sum = sum+n ;
		}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		String str = null;
		
		int sum = 0;
		
		System.out.println("Enter a String");
		
		Scanner in = new Scanner(System.in);
		
		str = in.nextLine();
		
		sum = sumOfdigit(str);
		
		System.out.println(str + " " + sum);
	}
}
