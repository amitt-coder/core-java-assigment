package com.kaizen.io;

import java.util.Scanner;

public class Simple {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter name:");
		
		String name = in.next();
		
		System.out.println("Your name is  " + name);
		 
		System.out.println("Your age:");
		
		int age = in.nextInt ();
		
		System.out.println("Your age is " + age);
	}
}
