package com.factorymethod;

 class Bmw extends Car {
	 
	 public String getName(String name) {
		 super.setName(name);
		 return name;
	 }
	 
	 
	 
	 
	 public String basePrice() {
		 return "390000";
		 
		 
	 }




	@Override
	public String colourName() {
		
		return "Black";
	}
}
