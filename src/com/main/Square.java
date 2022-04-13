package com.main;

import java.util.Scanner;

public class Square {
	
	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter a number");
		
		Scanner in = new Scanner(System.in);
		
		num = in.nextInt();
		
		num = num*num;
		System.out.println("Square of a number " + num);
	}
}
