package com.arraylist;

import java.util.ArrayList;

public class StringGet {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		
		Integer s = list.get(1);
		
		System.out.println(s);
		
		System.out.println("Array size");
		System.out.println(list.size());
	}
}
