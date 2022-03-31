package Inheritance.pr;

public class Parent extends Grand {
	
	public Parent() {
		super();                 
		System.out.println("bhupen");
		
	}
	
	public void Pname() {
		
		System.out.println("Bharat Patel");
	//	super.Gname();
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
	}
	
}