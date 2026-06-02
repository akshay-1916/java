package com.tka.controller;

import java.util.Scanner;

import com.tka.entity.Account;
import com.tka.service.AccountService;

public class AccountController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account(1,"Saving",10000);
		int choice,ch=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.Display Balance");
			System.out.println("4.Exit");
			
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("ENter amt to withdraw");
				AccountService.withdraw(a,sc.nextDouble());
				break;
			}
			case 2:
			{
				System.out.println("ENter amt to deposit");
				AccountService.deposit(a,sc.nextDouble());
				break;
			}
			case 3:
			{
				System.out.println("AccountBal"+a.getAccntbal());
				break;
			}
			case 4:
				System.exit(0);
				break;
			
			default:
				System.out.println("Enter valid choice");
			}
			System.out.println("Enter 1 to continue or else enter 0");
			ch=sc.nextInt();

	}while(ch==1);
	}
}

