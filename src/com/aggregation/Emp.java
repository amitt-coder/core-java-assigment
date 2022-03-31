package com.aggregation;

public class Emp {

	int id;
	String name;
	Address address;
	
	
	public Emp(int id, String name, Address address) {
	 this.id = id;
	this.name = name;
	this.address = address;
}

	public void display() {
		   System.out.println(id+" "+name);
		   System.out.println(address.city+" "+address.state+" "+address.country);
	}
	
	public static void main(String[] args) {
		
 		Address ad = new Address("","Dewas,MP","India");
 				  
 		
 		Emp e = new Emp(101,"Amit Patel",ad);
		
 		e.display();
	}
	
}