package com.ilp.utility;

import com.ilp.entity.Customer;

public class AccountUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer account=new Customer();
		account.setCustomerID("2794249");
		account.setCustomerName("Ss");
		account.setCustomerMobileNumber("329748897234");
		account.setCustomerDOB("07-07-07");
		account.setCustomerPincode("2424243");
		account.setCustomerOpenDate("09-09-09");

		//System.out.println("Account Number     Account Name     Account Balance");
		System.out.println(account.getCustomerID() + account.getCustomerName() + account.getCustomerMobileNumber() + account.getCustomerDOB() + account.getCustomerPincode() + account.getCustomerOpenDate());


		
	}

}
