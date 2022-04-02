package com.factorymethod;

public abstract  class Car {

	
	protected String name;
	
	public abstract String basePrice();
	public abstract String colourName();
	
	public void setName(String name) {
		this.name = name;
	}
	public String  getName(String name) {
		return name;
	}
}
