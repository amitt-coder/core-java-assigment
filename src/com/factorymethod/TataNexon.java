package com.factorymethod;

public class TataNexon  extends Car{

	@Override
	public String basePrice() {
		return "739000";
	}

	@Override
	public String colourName() {
		return "Blue";
	}
	
	public String getName() {
		super.setName(name);
		return name;
	}

}
