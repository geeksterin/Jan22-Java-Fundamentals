package com.geekster.accountspractice;

public class AccountDriver {

	public static void main(String[] args)
	{
		BankAccount sObj = new SavingsAccount("John", 10000);
		sObj.printStatement();
		
		BankAccount sObj1 = new SavingsAccount("Joe", 10000);
		sObj1.printStatement();
		
		CheckingAccount cObj = new CheckingAccount("Mike", 20000);
		cObj.depositAmount(4000);
		cObj.withdrawAmount(2000);
		cObj.printStatement();
		System.out.println("Number of accounts created = " +BankAccount.numberOfAccounts);
		System.out.println("Number of savings accounts created = " +SavingsAccount.numOfSavingAcnt);
		
		//Creating array of Bank Accounts
		//Displaying account holder's details
		//For loop
		
		//Take input - Saving/Checkings
	}
}
