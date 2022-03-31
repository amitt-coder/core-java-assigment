package Inheritance.pr;


// SUPER KEYWORD
 

public class Student  extends School{

	
	public Student() {
		super.SchoolName();
		super.SchoolAddress();
	}

//	public void name() {
//		super.SchoolName();
//		super.SchoolAddress();
//	}
	
	
	public static void main(String[] args) {
		
		Student st = new Student();
	//	st.name();
	}
	
}
