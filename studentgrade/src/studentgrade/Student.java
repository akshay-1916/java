package studentgrade;
import java.util.Scanner;
public class Student {
	public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);	
	
	System.out.println("Student Grade Calculater");
	
	System.out.println("Subject 1 Marks:");
	int s1=sc.nextInt();
	System.out.println("Subject 2 Marks:");
	int s2=sc.nextInt();

	System.out.println("Subject 3 Marks:");
	int s3=sc.nextInt();

	System.out.println("Subject 4 Marks:");
	int s4=sc.nextInt();

	System.out.println("Subject 5 Marks:");
	int s5=sc.nextInt();
	
	int percentage=(s1+s2+s3+s4+s4)/5;
	
	System.out.println("Student Percentage is: "+percentage);
	
	System.out.println("Your Grade Is");
	if(percentage>=90 && percentage<=100) {
		System.out.println("A ");
	}
	else if(percentage>=80 && percentage<=89) {
		System.out.println("B ");
	}
	if(percentage>=70 && percentage<=79) {
		System.out.println("C ");
	}
	if(percentage>=60 && percentage<=69) {
		System.out.println("D ");
	}
	if(percentage<=60) {
		System.out.println("F ");
	}
	
	
}
}
