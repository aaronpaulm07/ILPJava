package com.ilp.utility;
 
import java.util.ArrayList;
import java.util.Scanner;

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
		productList =ProductConfiguration.defaultProducts();
		servicesList =ProductConfiguration.defaultServices();
		Scanner scanner = new Scanner(System.in);
		System.out.println("***************BANK APPLICATION********************");
		char goToMainMenu;
		do {
			System.out.println(" 1.Create Account 2. Display Account 3.Transaction 4.Create Service 5.Create Customer  6.Manage ");
			int mainMenuChoice = scanner.nextInt();
			switch (mainMenuChoice) {
			case 1:
					customerList = CustomerService.addAccountToCustomer(customerList, productList);
					break;
			case 2:
					AccountService.displayAccount(customerList);
					break;
			case 3:
				   	AccountService.checkTransaction(customerList);
				   	break;
			
			case 4: 
			        servicesList= ProductConfiguration.createServices(servicesList);
				    break;
//			case 5:  
//					 productList.add( ProductConfiguration.createProduct(servicesList));
//					 break;	    
//			 
			case 5: customerList.add(CustomerService.createCustomer(productList));
			        break;
			case 6: customerList = ProductConfiguration.manageAccount(customerList);
					break;		
			
			 default :  break;
			}
			System.out.println("Go back to main menu (y/n)");
			goToMainMenu = scanner.next().charAt(0);
		}while(goToMainMenu == 'y');
	}
 
}