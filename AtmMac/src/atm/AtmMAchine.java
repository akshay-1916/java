package atm;
import java.util.*;
public class AtmMAchine extends FuncAtm {
	public static void main(String arg[]) {
		
	Scanner sc=new Scanner(System.in);
	
	
	
	
		System.out.println("Bank of SM");
		System.out.println("Welcome");
		
		System.out.println("Create a Pin");
		int Pin=sc.nextInt();
		
		int i=0;
		while(i<4) {
		System.out.println("1.Deposite\n2.Withdraw\n3.Check Balance\n4.Exit");
		System.out.print("Select Option:");
		int option=sc.nextInt();
		
		int balance=0;
		
		switch(option) {
		case 1:
			System.out.print("Enter Amount to Deposit:");
			int DAmount=sc.nextInt();
			balance=balance+DAmount;
			System.out.println("Your Amount is Deposited.");
            break;

			
		case 2:
			
			System.out.print("Enter Amount to Withdraw:");
			int WAmount=sc.nextInt();
			balance=balance+WAmount;
			System.out.println("Your Amount is Withdraw.");
            break;
            
		case 3:
			System.out.print("Enter Pin:");
			int UserPin=sc.nextInt();
			if(UserPin==Pin) {
            System.out.println("Your Bank Balance is "+balance);
			}
			
			else {
				System.out.println("Pin Is Wrong, Enter Correct PIn");
			}
			
            break;

		case 4:
			System.exit(0);


		}

           i++;

		}
		
	}

	}
	
