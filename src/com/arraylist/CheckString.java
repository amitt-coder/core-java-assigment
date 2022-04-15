package com.arraylist;

import java.util.ArrayList;

public class CheckString {

	public static void main(String[] args) {
		
		ArrayList<Character> arr = new ArrayList<>();
		
		arr.add('a');
		arr.add('m');
		arr.add('i');
		arr.add('t');
		
		boolean c = arr.contains('m');
		
		System.out.println(c);
	}
}
