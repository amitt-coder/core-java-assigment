package com.exception;

public class StringTry {
	
	public static void main(String[] args) {
		
		try {
		String str = null;
		
		System.out.println(str.length());
	} catch(NullPointerException e) {
		System.out.println("Please Enter a Valid String");
	}
		finally {
			System.out.println("finally block is always execute");
		}
}
}