package com.linkedlist;

import java.util.LinkedList;

public class ChangeElement {
	
	public static void main(String[] args) {
		
		LinkedList<String> lst = new LinkedList<>();
		
		lst.add("Java");
		lst.add("c");
		lst.add("c++");
		
		System.out.println("LinkedList " + lst);
		
		
		lst.set(1, "C");
		
		System.out.println(" Update LinkedList " + lst);
	
	String str = lst.remove(2);
	
	System.out.println("Remove Element " + str);
	
	
	System.out.println("Update List " + lst);
	
	
	}
}
