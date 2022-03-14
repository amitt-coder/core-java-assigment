package com.kaizen.io.ass;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your name ");
		String name = in.next();
		
		System.out.println("Enter your lastname ");
		String lastName = in.next();
		
		System.out.println("Enter your age ");
		int age = in.nextInt();
		
		System.out.println("Enter your address ");
		String address = in.next();
		
		System.out.printf("Name :" + name + lastName);
		System.out.printf("age :" + age);
		System.out.printf("Address :" + address);
		
	}
}
