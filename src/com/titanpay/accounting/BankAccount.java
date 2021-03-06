package com.titanpay.accounting;

public class BankAccount {
	private String bankName;
	private int routingNumber;
	private int accountId;
	
	public BankAccount(String bankName, int routingNumber, int accountId)
	{
		this.bankName = bankName;
		this.routingNumber = routingNumber;
		this.accountId = accountId;
	}
	
	public String deposit(double amt)
	{
		return "Depositing $" + amt + " in " + this.bankName + "Account Number: "
				+ this.accountId + " using Routing Number: " + this.routingNumber;
	}
}
