package com.geekster.accountspractice;

public class CheckingAccount extends BankAccount {

	public CheckingAccount(String name, double balance) {
		this.customerName = name;
		this.balance = balance;
		type = "Checking";
	}
	
	public void withdrawAmount(int moneyToWithdraw)
	{
		if(moneyToWithdraw < balance)
			balance = balance - moneyToWithdraw;
	}
}
