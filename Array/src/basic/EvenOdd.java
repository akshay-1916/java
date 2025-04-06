package basic;

public class EvenOdd {
public static void main(String ar[]) {
	int a[]= {1,3,2,4,6,54};
	int e=0,o=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			e++;
		}
		if(a[i]%2!=0) {
			o++;
		}
	}
	System.out.println("Count of Even number is "+e);
	System.out.println("Count of Odd number is "+o);

}
}
