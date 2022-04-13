package com.main;

import java.util.Arrays;
import java.util.Collections;

public class DecsendingArr {
	
	public static void main(String[] args) {
		
	Integer [] arr = {34,7,99,55,0};
	
	Arrays.sort(arr, Collections.reverseOrder());
	
	System.out.println("Array elements in decsending order");
	
	System.out.println(Arrays.toString(arr));
	}
}
