package com.overloading;

public class OverLDivision {

	
	public void Division(int i, int j) {
		System.out.println(i/j);
	}
	
	public void Division(float f, int i) {
		System.out.println(f/i);
	}
	
	public void Division(double d, int j) {
		System.out.println(d/j);
	}
	
	public static void main(String[] args) {
		
		OverLDivision div = new OverLDivision();
		
		div.Division(44, 2);
		div.Division(12.2f, 4);
		div.Division(55.2d, 2);
	}
}
