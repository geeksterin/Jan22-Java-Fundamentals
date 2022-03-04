package com.geekster.accountspractice;

public abstract class BankAccount {

	String customerName;
	double balance;
	String type;
	static int numberOfAccounts;
	
	public BankAccount() {
		numberOfAccounts++;
	}
	public void printStatement()
	{
		System.out.println("Balance : " + balance);
	}
	
	public void depositAmount(int amount)
	{
		balance = balance+amount;
	}
}
