package com.main;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str;
		char ch;
		
		System.out.println("Enter a string");
		Scanner in = new Scanner(System.in);
		
		str = in.nextLine();
		
		System.out.println("Reverse of a string");
		for(int i=str.length();i>0;i--) {
			
			System.out.print(str.charAt(i-1));
		}
	}
}
