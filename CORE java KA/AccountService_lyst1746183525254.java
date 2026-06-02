package com.tka.service;

import com.tka.entity.Account;

public class AccountService {
	
	public static Account withdraw(Account a,double amt)
	{
		
		if(amt<=a.getAccntbal())
			a.setAccntbal(a.getAccntbal()-amt);
		else
			System.out.println("Insufficient Balance");
		return a;
			
	}
	public static Account deposit(Account a,double amt)
	{
		
		
			a.setAccntbal(a.getAccntbal()+amt);
		
		return a;
			
	}

}
