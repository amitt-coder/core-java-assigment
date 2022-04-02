package com.factorymethod;

public class Baleno  extends Car{

	
	public String getName() {
		super.setName(name);
		return name;
	}
	
	
	
	@Override
	public String basePrice() {
		
		return "1000000";
	}



	@Override
	public String colourName() {
		
		return "Grey";
	}

}
