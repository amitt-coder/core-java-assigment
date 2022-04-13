package com.main;


import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
	      int n,
	        temp = 0, num, r;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter  a number ");
	        n = sc.nextInt();
	        num = n;
	        while (num > 0)
	        {
	            r = num % 10;
	            temp = temp + (r * r * r);
	            num = num / 10;
	        }
	        if (n == temp)
	        {
	            System.out.println("Armstrong Number");
	        }
	        else
	        {
	            System.out.println("Not Armstrong Number");
	        }
	    }
	
	}

