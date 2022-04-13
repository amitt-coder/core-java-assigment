package com.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PalindromicString {

	public static void main(String[] args) {
	
		PalindromicString obj = new PalindromicString();
		
		System.out.println("Enter a Sentence");
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
	
		str = str.toLowerCase();
	
		
		StringTokenizer st = new StringTokenizer(str);
		
		while(st.hasMoreElements()) {
			
			String word =st.nextToken();
			if(obj.isPalindrome(word)) {
				System.out.println(word + " ");
			}
		}
	}
			 boolean isPalindrome(String w) {
				 
				 String rev = "";
				 
				 for(int i=w.length()-1;i>=0;i--) {
					 
					 rev = rev + w.charAt(i);
				 }
				 if(rev.equals(w)) {
					 return true;
				 }
				 else 
					  return false;
				  
						
				 
			 }
		}

	

