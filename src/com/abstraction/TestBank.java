package com.abstraction;

public class TestBank {
	
	public static void main(String[] args) {
		
		Bank b;
		b = new SBI();
		System.out.println("Rate of Interest : " + b.getRateOfInterest());
		
		b = new ICICI();
		System.out.println("Rate of Interest : " + b.getRateOfInterest());
	}
}
