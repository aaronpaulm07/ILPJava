package com.ilp.utility;
 
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.entity.Product;
import com.ilp.entity.Services;
import com.ilp.service.AccountService;
import com.ilp.service.CustomerService;
import com.ilp.service.ProductConfiguration;
 
public class BankingUtility {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Services> servicesList = new ArrayList<Services>();
		ArrayList <Product> productList = new ArrayList<Product>();
		ArrayList <Customer> customerList = new ArrayList<Customer>();
		Customer customer = null;
//		servicesList =ProductConfiguration.defaultServices();

		servicesList =ProductConfiguration.defaultServices();
		Scanner scanner = new Scanner(System.in);
		char goToMainMenu;
		do {
			System.out.println(" 1.Create Accounts 2. Display Accounts 3.Transaction 4.Create service 5.Create Products");
			int mainMenuChoice = scanner.nextInt();
			switch (mainMenuChoice) {
			case 1:
				customer= CustomerService.createCustomer(productList);
				break;
			case 2:
				AccountService.displayAccount(customer);
				break;
			case 3:
				   AccountService.checkTransaction(customer);
				   break;
			
			case 4: 
			        servicesList= ProductConfiguration.createServices(servicesList);
				    break;
			case 5:  
					 productList.add( ProductConfiguration.createProduct(servicesList));
					 break;	    
			        
			        
			 default : System.exit(0);
				       break;
			}
			System.out.println("Go back to main menu (y/n)");
			goToMainMenu = scanner.next().charAt(0);
		}while(goToMainMenu == 'y');
	}
 
}