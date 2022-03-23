package com.staticc;

public class StaticVariable {

	int rollNo;
	String name;
	
	
	StaticVariable(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
		
	}
	public void show() {
		System.out.println(rollNo);
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		StaticVariable obj = new StaticVariable(01,"Amit");
		
		obj.show();
	}
}
