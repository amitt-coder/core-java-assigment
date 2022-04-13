package com.arrays;

public class SelectionArr {
	
	public static void main(String[] args) {
		
		int [] arr = {1,24,5,8,2};
		
		for(int i=0;i<arr.length;i++) {
			int n = i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[n] > arr[j]) {
				n = j;
			}
			}
		int temp = arr[n];
		arr[n] = arr[i];
		arr[i] = temp;
		
		System.out.println(arr[i]);	
		
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);	
//		}
		
	}
}
