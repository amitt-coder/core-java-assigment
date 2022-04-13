package com.main;

import java.util.Arrays;

public class Arraysort {
	
	public static void main(String[] args) {
		
		int [] arrays = new int[] {33,99,87,1,45};
		
		Arrays.sort(arrays);
		
		System.out.println("Element of array sorted");
		
		for(int i=0;i<arrays.length;i++) {
			System.out.println(arrays[i]);
		}
	}
}
