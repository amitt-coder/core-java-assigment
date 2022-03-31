package com.staticc;

public class StaticBlock {

	int num;
	String name;
	String add;
	static String country;
	static int count = 0;
	
	static {
		country = "india";
	}
	
	public StaticBlock(int num, String add, String name) {
		this.num   = num;
		this.name = name;
		this.add = add;
		count++;
		}
	
	public void show() {
		System.out.println(num);
		System.out.println(add);
		System.out.println(name);
	}
	public static void print() {
		System.out.println(country);
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		StaticBlock obj = new StaticBlock(01, "Amit Patel", "Dewas");
		StaticBlock obj1 = new StaticBlock(02, "Bhupendra Birla", "Indore");
		
		
		obj.show();
		obj1.show();
		StaticBlock.print();
	}
	
	
}
