package com.linkedlist;

import java.util.LinkedList;

public class AddElement {
	
	public static void main(String[] args) {
		
	LinkedList<String> L = new LinkedList<>();
	
	L.add("bhupen");
	L.add("himanshu");
	
	
	System.out.println("LinkedList " +L);

	L.add(0,"ranveer");
	
	System.out.println("LinkedList " +L);
	}
}
