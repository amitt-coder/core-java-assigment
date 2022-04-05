package com.exception;

public class TryCatch2 {
	
	public static void main(String[] args) {
		
		int i = 24;
		int j = 0;
		try {
		
		System.out.println(i/j);
	
		} catch(ArithmeticException e) {
		
		System.out.println(i*(j+2));
	}
}
}