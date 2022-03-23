package com.staticc;

public class StaticMethod {
	
	 int id;
	static String college;
	
	// Static Block
	
	static {
		college = "AMCAT";
	//	System.exit(0);
	}
	
	public static void print() {
		System.out.println(college);
		
	}
	
	public static void main(String[] args) {
		StaticMethod.print();
	}
}
