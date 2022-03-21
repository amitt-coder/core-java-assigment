package com.kaizen.constructor;

public class Clothes {
	String name;
	String color;
	String size;
	
	public Clothes() {
		System.out.println("Non Parameterised");
	}
	public Clothes(String name, String color, String size) {
		this.name = name;
		this.color = color;
		this.size = size;
		
	}
	public static void main(String[] args) {
		Clothes clothes = new Clothes();
		clothes.name = "SiyaRam";
		clothes.color = "Black";
		clothes.size = "XXL";
		clothes.describeClothes();
		
	}
	public void describeClothes() {
		System.out.println("Clothes [name=" + name + ", color=" + color + ", size=" + size );
	}
	
}
