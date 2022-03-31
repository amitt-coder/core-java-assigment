package com.overloading;

public class Overloading {

	

		public void sum(int i,int j) {
			System.out.println(i+j);
		}
		
		public void sum(int i, int j, int k) {
			System.out.println(i+j+k);
		}
		
		public void sum(int i, float f) {
			System.out.println(i+f);
		}
		 
		public static void main(String[] args) {
			
		Overloading o = new Overloading();
		o.sum(10, 30);
		o.sum(12, 13, 14);
		o.sum(7, 11.2f);
		}
		
	}

