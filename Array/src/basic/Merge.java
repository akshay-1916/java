package basic;
import java.util.*;
public class Merge {
	public static void main(String ar[]) {
		int a[]= {1,4,2,6,2,9,3};
		int b[]= {6,4,9,5,0,5,3,2};
		int c[]=new int[a.length+b.length];
		 System.arraycopy(a, 0, c, 0, a.length);
		 System.arraycopy(b, 0, c, a.length, b.length);
		 
		 System.out.println(Arrays.toString(c));

	}

}
