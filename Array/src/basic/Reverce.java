package basic;

import java.util.Scanner;

public class Reverce {
	public static void main(String ar[]) {
		
	
	Scanner sc=new Scanner(System.in);
	
	int a[]=new int[5];
	System.out.println("Enter the Element:");

	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		
	}
	
	for(int i=a.length-1;i>=0;i--) {
		System.out.println(a[i]);
		
	}
	}
}
