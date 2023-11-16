package com.ilp.entity;
 
public class Account {
	
	private String accountNo;
	private double accountBalance;
	private Product product;
	
	
	public Account(String accountNo, double accountBalance , Product product) {
//		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.product = product;
	}
private String getAccountNo() {
		return accountNo;
	}
private void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
private double getAccountBalance() {
		return accountBalance;
	}
private void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public void deposit(double amount) {
		this.accountBalance= this.accountBalance + amount ;
	}
	public void withdraw(double amount) {
		if(this.product.getProductCode().equalsIgnoreCase("1"))
		{
			if(this.accountBalance > (amount + 1000))
				this.accountBalance = this.accountBalance - amount ;
		}
		else if(this.product.getProductCode().equalsIgnoreCase("2"))
			if(this.accountBalance >=amount)
				this.accountBalance = this.accountBalance - amount ;
		else	
			this.accountBalance = this.accountBalance - amount ;
	}
}