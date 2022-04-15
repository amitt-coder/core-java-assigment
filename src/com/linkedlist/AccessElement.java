package com.linkedlist;

import java.util.LinkedList;

public class AccessElement {

	public static void main(String[] args) {
		
		LinkedList<Integer> ls = new LinkedList<>();
		
		ls.add(0);
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		
		System.out.println(ls);
		
		
		int n = ls.getFirst();
		System.out.println(n);
	
		int i = ls.get(3);
		System.out.println(i);
		
		int j = ls.getLast();
		System.out.println(j);
	
	}
	
}
