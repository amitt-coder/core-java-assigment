package com.overriding;

public class Dog extends Animal {
	
	public void eat() {
	super.eat();
		System.out.println("in a dog");
	}
}
