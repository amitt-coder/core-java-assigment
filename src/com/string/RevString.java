package com.string;

import java.util.Scanner;

public class RevString {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a String ");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
	
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev = rev + str.charAt(i);
			
			
		}
		System.out.println(rev);
	
	}
}
