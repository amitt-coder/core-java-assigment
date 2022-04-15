package com.arraylist;

public class CheckValue {
	
	public static void main(String[] args) {
		
	Object [] arr	= {12,"amit",true};
		
	Object check = 12 ;
	
	
	boolean found = false;
	
	for(Object n :arr) {
		
		if(n == check) {
		 found = true;
			break;
		}
	}
	if(found) {
		System.out.println(check + " is found");
	}	else {
	System.out.println(check + " is not found");		
		}
	
	
	
	
	
	}
}
