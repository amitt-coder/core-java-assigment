package com.factorymethod;

public class Jaguar  extends Car{

	
	public String getName() {
		super.setName(name);
		return name;
	}
	
	public String basePrice() {
		
		return "710000";
	}

	@Override
	public String colourName() {
		
		return "white";
	}

}
