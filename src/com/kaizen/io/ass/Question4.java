package com.kaizen.io.ass;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n =5;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		
	}
}
