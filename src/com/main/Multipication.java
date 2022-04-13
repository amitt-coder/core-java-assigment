package com.main;

public class Multipication {
	
	public static void main(String[] args) {
		
	int [][]a = {{5,6,3},{3,9,7},{3,2,9}};
	
	int [][]b = {{3,8,7},{6,4,2},{6,0,6}};
	
	int c [][] = new int [3][3];
	
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			
	 c[i][j] = a[i][j] * b[i][j];
	 
	System.out.print(c[i][j] + " ");		
		}
		System.out.println();
	}
	
	
	}
}