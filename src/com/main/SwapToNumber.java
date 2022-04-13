package com.main;

import java.util.Scanner;

public class SwapToNumber {
	
	public static void main(String[] args) {
		
		int x,y,temp;
		
		System.out.println("Enter x and y number");
		
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		
		System.out.println("Before Swapping " + x + y);
		
		temp = x;
		 x = y;
		 temp = y;
		 
		 System.out.println("After Swapping " + x + y);
	}
}
