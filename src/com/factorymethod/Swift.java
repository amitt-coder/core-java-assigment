package com.factorymethod;

public class Swift  extends Car {

	
	public String getName() {
		super.getName(name);
		return name;
	}
	
	
	
	
	@Override
	public String basePrice() {
		
		return "600000";
	}




	@Override
	public String colourName() {
		
		return "dark-blue";
	}

	
	
}
