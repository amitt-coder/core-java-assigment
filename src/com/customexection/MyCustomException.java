package com.customexection;

public class MyCustomException  extends Exception{

	String str1="ait";
	
	public MyCustomException(String str2) {
		str1=str2;
	}
	public String toString() {
		return ("MyException Occurred: " + str1);
	}
	
}
