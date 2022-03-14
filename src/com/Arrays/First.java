package com.Arrays;

public class First {
	public static void main(Argument[] args) {
		
		int [][] array2D = { 
				{1,2,3,4,5},
				{7,8,3,4,5}
				
		};
		for(int i=0;i<2;i++) {
			for(int j=0;j<array2D[i].length;j++) {
				System.out.print(array2D[i][j] + " ");
			}
			System.out.println();
		}
 	}
}
