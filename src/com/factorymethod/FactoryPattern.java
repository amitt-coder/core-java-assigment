package com.factorymethod;


import java.util.Scanner;

public class FactoryPattern {
	
	public static void main(String[] args) {
		System.out.println("Please Enter Car Name");
		Scanner s = new Scanner(System.in);
		
		String carName = s.nextLine();
		
		
		Car carFactory = CarFactory.getCarFactory(carName);
		
		System.out.println("Name : " + carFactory.getName(carName));
		System.out.println("Base Price : " + carFactory.basePrice());
		System.out.println("Colour Name : " + carFactory.colourName());
		
		
	
		
	}

	
	
	}

