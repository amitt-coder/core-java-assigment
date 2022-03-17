 import java.util.Scanner;

public class PrimeNumber {
	
		public void isPrimeNumber(int n) {
			int count = 0;
			for(int i=2;i<n;i++) {
				if(n%i == 0) {
					count ++;
					break;
				}
			}
			if(count>0) {
				System.out.println("not a prime number");
			} else {
				System.out.println("prime number");
			}
		}
		public static void main(String[] args) {
	PrimeNumber obj = new PrimeNumber();
	obj.isPrimeNumber(13);
	
	}
}