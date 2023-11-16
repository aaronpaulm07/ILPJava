package com.ilp.service;
 
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.entity.Product;
import com.ilp.entity.Services;
 
public class AccountService {
 
	public static Account createAccount(ArrayList <Product> availableProductList ) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter opening accountNo");
		String accNo = scanner.nextLine();
		System.out.println("Enter opening accountBalance");
		double openingBalance = scanner.nextDouble();
//		ArrayList<Services> availableServices = ProductConfiguration.defaultServices();
//		ArrayList<Product> availableProducts = ProductConfiguration.defaultProducts();
		Product product = ProductConfiguration.selectProduct(availableProductList);
		Account account = new Account(accNo,openingBalance,product); //constructors are used to initialize member variables
		return account;
	}
 
	public static void displayAccount(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Account No"+"    "+"Account balance"+"     "+"Product");
		for(Account account:customer.getAccountList())
		
		   System.out.println(account.getAccountNo()+"      "+account.getAccountBalance()+"     "+ account.getProduct().getProductName());
	}
	public static void checkTransaction(Customer customer) {
		for(Account account: customer.getAccountList())
			System.out.println(account.getAccountNo()    +"      "+account.getAccountBalance());
		
		System.out.println("Which account ? Enter account index");
		Scanner scanner = new Scanner(System.in);
		int accIndex = scanner.nextInt();
		Account account = customer.getAccountList().get(accIndex);
		for(Services service: account.getProduct().getServiceList()) 
		{
		     System.out.println(service.getServiceCode()+ "   " + service.getServiceName());
	      }
		System.out.println("which service? ");
		int serviceIndex = scanner.nextInt();
		System.out.println("enter number of transactions?");
		int noOfTransaction = scanner.nextInt();
        double total = noOfTransaction * (account.getProduct().getServiceList().get(serviceIndex).getRate());
        System.out.println("total bill : "+ total);
      }
}