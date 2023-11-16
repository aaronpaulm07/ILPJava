package com.ilp.entity;

public class Account {
	private String accountNumber;
	private String accountName;
	private double accountBalance;
	
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountName(String accountName)
	{
		this.accountName=accountName;
	}
	public String getAccountName()
	{
		return accountName;
	}
	public void setAccountBalance(double accountBalance)
	{
		this.accountBalance=accountBalance;
	}
	public double getAccountBalance()
	{
		return accountBalance;
	}
}
