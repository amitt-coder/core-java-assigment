package com.kaizen.constructor;

public class Student {

		int id;
		String name;
		String address;
		
		public Student() {
			System.out.println("Non parameterised");
		}
		
		// Parameterised Constructor
		public Student(int id, String name, String address) {
			this.id = id;
			this.name = name;
			this.address = address;
			
		}
		public static void main(String[] args) {
			
			Student student = new Student();
			student.id = 1;
			student.name = "Amit Patel";
			student.address = "Dewas";
			student.describeStudent();
			
			
		}
	
		public void describeStudent() {
			System.out.println("Student [id=" + id + ", name=" + name + ", address=" + address );
		}

		
}

