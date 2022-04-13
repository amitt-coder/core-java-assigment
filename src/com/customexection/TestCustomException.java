package com.customexection;

public class TestCustomException {

	public static void main(String[] args) {
		
		try {
			
		
			throw new MyCustomException("NullPointerException");
		
		}catch(MyCustomException e) {
		
			System.out.println(e);
		}
	}
}
