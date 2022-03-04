package com.geekster.accountspractice;

public class SavingsAccount extends BankAccount {

	static int numOfSavingAcnt;
	
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
		
	}
	public SavingsAccount(String name, double balance) 
	{
		this.customerName = name;
		this.balance = balance;
		type = "Savings";
		numOfSavingAcnt++;
	}
}
