package com.kaizen.constructor;

public class Laptop {
	String Brand;
	String Color;
	String Ram;
	String Rom;
	int price ;
	
	public Laptop() {
		System.out.println("Non Parameterised");
	}
	public Laptop(String Brand, String color, String Ram, String Rom, int price) {
		this.Brand = Brand;
		this.Color = Color;
		this.Ram = Ram;
		this.Rom = Rom;
		this.price = price;
	}
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.Brand = "hp";
		laptop.Color = "Black";
		laptop.Ram = "12GB";
		laptop.Rom = "111GB";
		laptop.price = 35000;
		laptop.describeLaptop();
	}
	public void describeLaptop() {
	System.out.println("Laptop - Brand=" + Brand + ", Color=" + Color + ", Ram=" + Ram + ", Rom=" + Rom + ", price=" + price);
	}
	
	}

