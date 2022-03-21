package com.kaizen.constructor;

public class Mobile {

	String name;
	String color;
	String processor;
	
	public Mobile() {
		System.out.println("Non Parameterised ");
	}
	
	public Mobile(String name, String color, String processor) {
		this.name = name;
		this.color = color;
		this.processor = processor;
		
	}
	
	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		mobile.name = "realme 3pro";
		mobile.color = "Blue";
		mobile.processor = "Qualcomm SDM710 Octa-core";
		mobile.describeMobile();
	
	}
	public void describeMobile() {
		System.out.println("Mobile [name=" + name + ", color=" + color + ", processor=" + processor );
	}

	
}
