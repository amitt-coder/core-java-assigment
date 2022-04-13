package com.main;

public class Evennnn {
	
	public int sum(int i,int j) {
		int c = i+j;;
		return c;
		
		}
	
		public int sub(int i, int j) {
			int c = i-j;
			return c;
		}
		public int mul(int i , int j) {
			int c = i*j;
			return c;
		}
		public int div(int i, int j) {
			int c = i/j;
			return c;
		}
	
	public static void main(String[] args) {
		
		Evennnn even = new Evennnn();
		
	int c	=	even.sum(10, 20);
	int c1 	=	even.sub(10, 20);
	int c2 	=	even.mul(10, 20);
	int c3	=	even.div(20, 10);
		
		System.out.println(c);
	  	System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}