package com.encapsulation;

public class Employe {

		public static void main(String[] args) {
			
			EmployeClass obj = new EmployeClass();
			
			obj.setid(01);
			obj.setName("Amit Patel");
			obj.setsalary(500);
			obj.setaddress("Indore");
			
			
			System.out.println(obj.getid());
			System.out.println(obj.getName());
			System.out.println(obj.getsalary());
			System.out.println(obj.address());
		}
}
