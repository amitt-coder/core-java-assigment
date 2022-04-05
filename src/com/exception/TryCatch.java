package com.exception;

public class TryCatch {
	
	public static void main(String[] args) {
		
		try {
		int a=20;
		int b=0;
		
		System.out.println(a/b);
		
		} catch(ArithmeticException e) {
		//	System.out.println("Exception...");
		}
		finally {
			System.out.println("Exception");
		}
}
}