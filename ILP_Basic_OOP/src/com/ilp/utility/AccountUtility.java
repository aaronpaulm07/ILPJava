package com.ilp.utility;

import com.ilp.entity.Account;

public class AccountUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account();
		account.setAccountNumber("acc2794249");
		account.setAccountName("Savings");
		account.setAccountBalance(32974.8234);;

		System.out.println("AccountNumber     Account Name     Account Balance");
		System.out.println(account.getAccountNumber()+"        "+account.getAccountName()+"          "+account.getAccountBalance());

		
	}

}
