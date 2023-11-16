package com.ilp.utility;
 
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.service.AccountService;
import com.ilp.service.CustomerService;
 
public class BankingUtility {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
//		ArrayList <Account> accountList = new ArrayList<Account>();
//		ArrayList <Customer> customerList = new ArrayList<Customer>();
		Customer customer = null;
		Account account = null;
		Scanner scanner = new Scanner(System.in);
		char goToMainMenu;
		do {
			System.out.println(" 1.Create Accounts 2. Display Accounts 3.Transaction 4.Exit");
			int mainMenuChoice = scanner.nextInt();
			switch (mainMenuChoice) {
			case 1:
				customer= CustomerService.createCustomer();
				break;
			case 2:
				AccountService.displayAccount(customer);
				break;
			case 3:
				AccountService.checkTransaction(account);
				break;
			
			case 4:
				System.exit(0);
				break;
			}
			System.out.println("Go back to main menu (y/n)");
			goToMainMenu = scanner.next().charAt(0);
		}while(goToMainMenu == 'y');
	}
 
}