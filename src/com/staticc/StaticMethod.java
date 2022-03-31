package com.staticc;

public class StaticMethod {
	
	static int id ;
	static String college;
	
	// Static Block
	
	 static {
		id = 2;
		 college = "AMCAT";
		System.exit(0);
	}
	
	public static void print() {
		System.out.println(college);
		System.out.println(id);
		
	}
	
	public static void main(String[] args) {
		StaticMethod.print();
	}
}
