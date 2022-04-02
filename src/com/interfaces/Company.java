package com.interfaces;

public class Company implements Manager {

	
	public void dispay() {
		System.out.println("Working.....");
		}
		
	public void show() {
	System.out.println("caring");
		}
	public static void main(String[] args) {
		
		Manager m;
		m = new Company();
		m.dispay();
	}
	
	
	
}
