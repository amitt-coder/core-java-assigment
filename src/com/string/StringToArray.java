package com.string;

public class StringToArray {

	public static void main(String[] args) {

		String s1 = "Welcome to Indore";

		char[] ch = s1.toCharArray();

		for (int i = 0; i < s1.length(); i++) {

			System.out.print(ch[i]);

		}
		
		
	}
}
