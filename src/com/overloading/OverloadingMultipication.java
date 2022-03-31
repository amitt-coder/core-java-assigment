package com.overloading;

public class OverloadingMultipication {

	
	public void multipication(int i,double d) {
		System.out.println(i*d);
	}
	
	public void multipication(float f, int i, int j) {
		System.out.println(f*i*j);
	}
	
	public void multipication(int i, float f, double d) {
		System.out.println(i*f*d);
	}
	
	public static void main(String[] args) {
		
		OverloadingMultipication mul = new OverloadingMultipication();
		
		mul.multipication(12, 88.3d);
		mul.multipication(5.5f, 4, 2);
		mul.multipication(5, 4.3f, 7.2d);
	}
}
