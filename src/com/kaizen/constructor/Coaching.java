package com.kaizen.constructor;

public class Coaching {

	int id;
	String name ;
	String address;
	
	public Coaching() {
		System.out.println("Non Parameterise ");
	}
	
	public Coaching(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
		
	}
	
	public static void main(String[] args) {
		
		Coaching coaching = new Coaching();
		
		coaching.id = 414;
		coaching.name = "Kaizen Coding  BootCamp";
		coaching.address = "Shekar Central,Palasia Square,Indore";
		coaching.describecoaching();
	}
	
	public void describecoaching() {
		System.out.println("Coaching id=" + id + ", name=" + name + ", address=" + address );
	}

	
}
