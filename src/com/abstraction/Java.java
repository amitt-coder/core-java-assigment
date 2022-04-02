package com.abstraction;

public class Java  extends Language {

	public void display() {
		System.out.println("Java is programming language");
	}
	public static void main(String[] args) {
	
		Java j;
		j = new Java();
		j.read();
		j.display(); 
	}
	
}
