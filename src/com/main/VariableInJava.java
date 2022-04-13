package com.main;

public class VariableInJava {
	
	int i = 10; 		// instance varible

	public void show() {
		System.out.println( i);
		i = 90;
		System.out.println(i);
		int i = 89; // local varible
		
		System.out.println(i);
	}
	public void display() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		VariableInJava obj = new VariableInJava();
		
		obj.show();
		obj.display();
	}

}
