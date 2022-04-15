package com.string;

public class LUchar {
	
	public static void main(String[] args) {
		String str = "amitpatel";
		String s="";
		
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			
		if(i % 2 ==0) {
			s=s+ch;
		} else {
			ch = (char)(ch-32) ;
				s=s+ch;
			}
		}
		System.out.println(s);
		}
	}

