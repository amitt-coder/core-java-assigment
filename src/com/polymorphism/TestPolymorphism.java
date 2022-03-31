package com.polymorphism;

public class TestPolymorphism {
	
	public static void main(String[] args) {
		
		Bank b ;
		b = new SBI();
		System.out.println("SBI Rate of Interest :" + b.getRateInterest());
		
		b = new ICICI();
		System.out.println("ICICI Rate of Interest : " + b.getRateInterest());
		
		b = new AXIS();
		System.out.println("AXIS Rate of Interest : " + b.getRateInterest());
	}
}
