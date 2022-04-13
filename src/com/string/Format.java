package com.string;

public class Format {
	
	public static void main(String[] args) {
		
		String firstName = "Amit";
		String lastName = "Patel";
		
		String s1 = String.format("firstName %s", firstName);
		
		String s2 = String.format("lastName %s", lastName);
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
