package com.inheritance;

public class Manager extends Employe {

	
	public void bonus() {
		System.out.println();
		
		
	}
	public static void main(String[] args) {
		Manager m = new Manager();
		m.bonus();
		m.name();
		m.salary();
		m.age();
	}
}
