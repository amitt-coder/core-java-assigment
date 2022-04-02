package com.interfaces;

public class College implements StudentA,StudentB {

	@Override
	public void study() {
		System.out.println("first interface");
	}
	public void read() {
		System.out.println("second interface");
	}
	
	
	public static void main(String[] args) {
		
		College c = new College();
		c.study();
		c.read(); 
		
		

		
	}

	
	
	
}
