package com.ilp.entity;

public class Transaction {
public void getTransactionCode() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void setTransaction() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
	private String transactionCode ;
	private Customer customer;
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
