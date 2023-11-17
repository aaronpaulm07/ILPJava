package com.ilp.entity;

import java.util.ArrayList;

public class Customer {
public void getCustomerCode() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void getCustomerName() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void getAccountList() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void setCustomerCode() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void setCustomerName() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void setAccountList() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
	private String customerCode;
	private String customerName;
	private ArrayList <Account> accountList;
	
	
	public Customer(String customerCode, String customerName, ArrayList<Account> accountList) {
//		super();
		this.customerCode = customerCode;
		this.customerName = customerName;
		this.accountList = accountList;
	}
private ArrayList<Account> getAccountList() {
	 return accountList;
     }
private void setAccountList(ArrayList<Account> accountList) {
	 this.accountList = accountList;
    }
private String getCustomerCode() {
		return customerCode;
	}
private void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
private String getCustomerName() {
		return customerName;
	}
private void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
 
}
 