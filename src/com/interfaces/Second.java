package com.interfaces;

public class Second implements First {

	public void print() {
		System.out.println("First program in interface");
	}

	public static void main(String[] args) {
		
		Second obj = new Second();
		
		obj.print();
	}
	
	
}
