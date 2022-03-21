package com.kaizen.constructor;

public class Year {
	
	String Year ;
	String Month;
	int Week;
	String Day;
	
	public Year() {
		System.out.println("Non parameterised ");
	}
	public Year(String Year, String Month, int Week, String Day) {
		this.Year = Year;
		this.Month = Month;
		this.Week = Week;
		this.Day = Day ;
	}
	public static void main(String[] args) {
		
		Year year = new Year();
		year.Year = "2022";
		year.Month = "March";
		year.Week = 04;
		year.Day = "Monday";
		year.describeYear();
	}
	
	public void describeYear() {
		System.out.println("Year [Year=" + Year + ", Month=" + Month + ", Week=" + Week + ", Day=" + Day);
	}
	
}
