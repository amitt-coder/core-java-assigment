package com.kaizen.constructor;

public class Fan {

	String name;
	String color;
	String model;
	
	public Fan() {
		System.out.println("Non Parameterised ");
	}
	public Fan(String name, String color, String model) {
		this.name = name;
		this.color = color;
		this.model = model;
	}
	public static void main(String[] args) {
		
		Fan fan = new Fan();
		fan.name = "RR";
		fan.color = "Brown";
		fan.model = "2020";
		fan.describeFan();
	}
	public void describeFan() {
		System.out.println("Fan [name=" + name + ", color=" + color + ", model=" + model );
	}
	

}
