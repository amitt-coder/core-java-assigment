package com.accessmodifiers;

public class B extends A {
	
	public void show() {
		super.dis();
		
	}
	
	public static void main(String[] args) {
		
	B b = new B();
	b.dis();
	
	}
}
