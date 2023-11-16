package com.ilp.utility;
 
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.service.AccountService;
 
public class BankUtility  {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
//		ArrayList <Account> accountList = new ArrayList<Account>();
//		ArrayList <Customer> customerList = new ArrayList<Customer>();
//		Customer customer = null;
		Account account= null;
		Scanner scanner = new Scanner(System.in);
		char goToMainMenu;
		do {
			System.out.println(" 1.Create Account 2. DisplayAccount 3. Deposit");
			int mainMenuChoice = scanner.nextInt();
			switch (mainMenuChoice) {
			case 1:
		    	account = AccountService.createAccount();
		    	break;
			case 2:
				AccountService.displayAccount(account);
				break;
			case 3:
				AccountService.deposit();
				break;
			}
			System.out.println("Go back to main menu (y/n)");
			goToMainMenu = scanner.next().charAt(0);
		}while(goToMainMenu == 'y');
	}
 
}