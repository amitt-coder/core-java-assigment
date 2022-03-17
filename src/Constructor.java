
public class Constructor {
	
	int i;
	
	public Constructor() {
		int i = 100;
		System.out.println("in constructor");
	}
	public Constructor(int p) {
		i = p;
		
		System.out.println("in  param constructor");
	}
	public void init() {
		i =10;
	}
	public void display() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		
		Constructor obj = new Constructor();
		
		obj.init();
		obj.display();
	}
}
