package com.factorymethod;

public class Alto extends Car {

	
	public String getName() {
		super.setName(name);
		return name;
	}
	
	
	
	
	@Override
	public String basePrice() {
		
		return "325000";
	}




	@Override
	public String colourName() {
		
		return "white-blue";
	}

}
