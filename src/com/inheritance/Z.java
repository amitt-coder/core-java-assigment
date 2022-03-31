package com.inheritance;

public class Z extends Y{

		public void m1() {
			System.out.println("In m1 method class z");
		}
		public static void main(String[] args) {
			
			X x = new X();
			x.m1();
			
		}
}
