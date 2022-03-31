package com.inheritance;

public class Truck  extends Vehicle{

public void fuelAmount() {
		System.out.println("fuelAmount method from Truck class");
	}
	
	public void capacity() {
		System.out.println("capcity method from Truck class");
	}
	public void applyBrakes() {
		System.out.println("applyBrakes method from Truck class");
	}
	public static void main(String[] args) {
		Truck t = new Truck();
		t.fuelAmount();
		t.capacity();
		t.applyBrakes();
	}
}
