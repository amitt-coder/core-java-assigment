package com.interfaces;

public class Parent implements Son,Daughter {

	@Override
	public void run() {
		System.out.println("in school camp");
		
	}
	public void work() {
		System.out.println("in it company");
	}
	
	public static void main(String[] args) {
		
//		Daughter da;
//		da = new Parent();
//		da.work();

//	Son s;
//	s = new Parent();
//	s.run();
//	
	
	Parent p = new Parent();
	p.run();
	p.work();
	
	
	
	}
}	
	
	

