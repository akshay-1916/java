package basic;

public class SecondLarge {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,4,2,8,3,1};
		int max=a[0];
		for (int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println(max);

	}

}
