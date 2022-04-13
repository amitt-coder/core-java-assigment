package com.arrays;

public class BubbleArray {
	
	public static void main(String[] args) {
		
		int [] arr = {2,3,55,1,78,7,50,33,22};
		
		
		
		int temp = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
	}
}
