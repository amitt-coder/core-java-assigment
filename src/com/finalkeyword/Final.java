package com.finalkeyword;

public class Final {
	
	 final int  a = 20;
	
	public void print() {
		 a = 30;
	}
	public static void main(String[] args) {
		
		Final f = new Final();
		f.print();
	
	}
}
