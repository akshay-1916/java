package basic;
import java.util.*;
public class copy {
	public static void main (String arg[]) {
		int a[]= {1,2,3,4,5};
		int b[]=Arrays.copyOf(a, a.length);
//		for (int i=0;i<a.length;i++) {
//			a[i]=b[i];
//		}
		
		for (int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
