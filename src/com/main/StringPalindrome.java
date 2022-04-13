package com.main;

import java.util.Scanner;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		String reverseStr = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			reverseStr = reverseStr + str.charAt(i);
		}
		if(str.equals(reverseStr)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
