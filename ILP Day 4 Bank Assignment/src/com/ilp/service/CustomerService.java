package com.ilp.service;
 
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
//import com.ilp.service.AccountService;
import com.ilp.entity.Product;

 
public class CustomerService {
 
	public static Customer createCustomer(ArrayList <Product> availableProductList) {
		// TODO Auto-generated method stub
		ArrayList <Account> accountList = new ArrayList <Account>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		String customerName = scanner.nextLine();
		System.out.println("Enter customer code");
		String customerCode = scanner.nextLine();
		char addaccount;
		Account account =new Account("0",0,null) ;
		do {
			account = AccountService.createAccount(availableProductList);
			accountList.add(account);
			System.out.println("Add more account (y/n)");
			addaccount = scanner.next().charAt(0);
		}while(addaccount == 'y');
		Customer customer = new Customer(customerCode,customerName, accountList);
 		return customer;
	}
 
	public static void displayCustomer(ArrayList <Customer> customerList) {
		// TODO Auto-generated method stub
//		System.out.print("displayCUstomer ");
		System.out.println("Enter customer code:");
		Scanner scanner = new Scanner(System.in);
		String customerSearchCode = scanner.nextLine();
		for(Customer customer: customerList)
		{	if(customer.getCustomerCode().equalsIgnoreCase(customerSearchCode))
			{ 	System.out.println("Customer Code"+"    "+"Customer Name"+"  " );
				System.out.println(customer.getCustomerCode()+"      "+customer.getCustomerName() + "    "   );
				for(Account account:customer.getAccountList())
					System.out.println(account.getAccountBalance()+ "  " + account.getAccountNo());
			}
		}
	}
	public static void displayAllCustomer(ArrayList <Customer> customerList) {
		// TODO Auto-generated method stub
		for(Customer customer:customerList)
		{   System.out.println("Customer Code"+"    "+"Customer Name"+"  ");
			System.out.println(customer.getCustomerCode()+"      "+customer.getCustomerName() + "    "   );
			for(Account account:customer.getAccountList())
				System.out.println(account.getAccountBalance()+ "  " + account.getAccountNo());
	     }
	}
	public static ArrayList<Customer>  addAccountToCustomer(ArrayList<Customer> customerList, ArrayList <Product> availableProductList) {
		System.out.println("Enter Customer ID :");
		Scanner scanner = new Scanner(System.in);
		String customerSearchCode = scanner.nextLine();
		for(Customer customer: customerList)
		{	if(customer.getCustomerCode().equalsIgnoreCase(customerSearchCode))
			     customer.getAccountList().add(AccountService.createAccount(availableProductList));
		}
		return  customerList;
	}
}
