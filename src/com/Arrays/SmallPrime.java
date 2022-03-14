package com.Arrays;

public class SmallPrime {
	public static void main(Argument[] args) {
		
		int [] smallPrimes = {2,3,5,7,11,13};
		int [] luckyNumbers = smallPrimes;
		luckyNumbers[5] = 12;
		
		 System.out.println(luckyNumbers[5]);
		 
	}
}
