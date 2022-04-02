package com.finalkeyword;

public class Main extends FinalDemo {

	public void display() {
		System.out.println("This is a final overridding");
	}
	
	public static void main(String[] args) {
		
		Main obj = new Main();
		obj.display();
	}
	
}
