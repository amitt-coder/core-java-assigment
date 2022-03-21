package com.kaizen.constructor;

public class Hr {
	
	String name;
	String Address;
	String Mobile;
	
	
	public Hr() {
		System.out.println("Non parameterised");
	}
	public Hr(String name, String Address, String Mobile) {
		this.name = name;
		this.Mobile = Mobile;
		this.Address = Address;
		
		
	}
	public static void main(String[] args) {
		Hr  hr = new Hr();
		hr.name = "Ayushi Patil";
		hr.Mobile = "7725853216";
		hr.Address = "Silicon City Indore";
		hr.describeHr();
		
	}
	public void describeHr() {
		System.out.println("Hr [name=" + name + ", Address=" + Address + ", Mobile=" + Mobile );
	}
	
	
}
