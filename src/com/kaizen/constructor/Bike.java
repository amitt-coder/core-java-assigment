package com.kaizen.constructor;

public class Bike {

	String name ;
	String color;
	String model;
	
	public Bike() {
		
		System.out.println(" Non Parameterise ");
	}
	public Bike(String name, String color, String model) {
		this.name = name;
		this.color = color;
		this.model = model;
		
	}
	
	public static void main(String[] args) {
		Bike bike = new Bike();
 		bike.name = "Hero";
		bike.color = "Black";
		bike.model = "Deluxe";
		bike.describeBike();
	}
	
	public void describeBike() {
		System.out.println("Bike [name=" + name + ", color=" + color + ", model=" + model + "]");
	}
	
	
}
