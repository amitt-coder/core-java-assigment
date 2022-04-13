package com.customexection;

public class Main {

	public static void main(String[] args) {
		
		try {
			throw new Atm();
			
		}catch(Atm e) {
			System.out.println(e);
			System.out.println("please valid amount");
		}
	}
}
