package com.main;

public class FibbonacciSeries {
	
	public static void main(String[] args) {
		
	int n=1;
	int m=0;
	int a;
	int count=10;
	
	System.out.println("Fibbonacci series");
	
	System.out.print(n +" "+m);
		
	for(int i=2;i<count;i++) {
		
		a = n+m;
		
		System.out.print(" " + a);
		
	n=m;
	m=a;
	}
	}
}
