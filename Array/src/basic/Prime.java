package basic;

public class Prime {
public static void main (String arg[]) {
	
	int arr[]= {1,4,2,6,34,6,78,4,3,2,7,11,19};
	System.out.println("Prime number in the array");
	for(int num:arr) {
		if(isPrime(num)) {
			System.out.println(num+"");
		}
	}
	
	}
public static boolean isPrime(int n) {
		if(n<=1) return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
}
}
