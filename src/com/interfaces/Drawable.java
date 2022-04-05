package com.interfaces;

public interface Drawable {
	
	void draw();
	
	default void msg() {
		System.out.println("default method");
	}
}
