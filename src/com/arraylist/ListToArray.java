package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Amit", "Shivam", "Sachin");
		Object[] array = list.toArray();
 		System.out.println(Arrays.toString(array));
		 
		
		
		
	}
}
