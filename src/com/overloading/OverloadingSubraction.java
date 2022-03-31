package com.overloading;

public class OverloadingSubraction {
	
	public void subtraction(int i, int j) {
		System.out.println(i-j);
	}
	
	public void subtraction(int i, float f) {
		System.out.println(i-f);
	}
	
	public void subtraction(double d, float f) {
		System.out.println(d-f);
	}
	public static void main(String[] args) {
		
		OverloadingSubraction sub = new OverloadingSubraction();
		
		sub.subtraction(43, 12);
		sub.subtraction(77, 55.4f);
		sub.subtraction(22.4d, 11.2f);
	}
	
}
