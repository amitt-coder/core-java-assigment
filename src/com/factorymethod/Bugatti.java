package com.factorymethod;

public class Bugatti extends Car {

	
	public String getName() {
		super.setName(name);
		return name;
	}
	
	public String basePrice() {
		return "12000000";
	}

	@Override
	public String colourName() {
		
		return "Black";
	}
}
