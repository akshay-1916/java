package basic;

public class MissingNo {
	public static void main(String arg[]) {
		int a[]= {1,2,3,5,6};
		int n=a.length+1;
		
		int sum=n*(n+1)/2;
		int actualSum=0;
		
		for(int num:a) {
			actualSum+=num;
		}
		int MissingNu=sum-actualSum; 
		System.out.println("Missing number:"+MissingNu);
	}

}
