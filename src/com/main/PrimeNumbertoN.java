package com.main;

import java.util.Scanner;

public class PrimeNumbertoN {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number ");
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i=2;i<=n;i++) {
			int r=0;
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					r++;
				}
			}
			if(r==2) {
				System.out.println(i+ " ");
			}
		}
	}
}
