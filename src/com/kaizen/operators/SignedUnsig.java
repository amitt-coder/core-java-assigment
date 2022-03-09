package com.kaizen.operators;

public class SignedUnsig {
	public static void main(String[] args) {
		
		int x = 0B00000000_00000000_00000000_00000100;
		System.out.println(x);
		System.out.println(x >> 1);
		System.out.println(x << 1);
		
		
		
		int y = 0B11111111_11111111_11111111_11111100;
		System.out.println(y);
		System.out.println(y >> 1);
		System.out.println(x << 1);
		
		int z = 0B11111111_11111111_11111111_11111111;
		System.out.println(z >>> 29);
		System.out.println(z >>> 30);
		System.out.println(z >>> 31);
		}
}
