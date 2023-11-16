package com.ilp.utility;

import java.util.Scanner;

import com.ilp.entity.Product;
import com.ilp.entity.Service;
import com.ilp.service.ProductService;
import com.ilp.service.ServiceService;

public class ProductUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Product product = null;
		Service service = null;
		char goToMainMenu;
		do {
		System.out.println("1.create Product 2.display Product 3.create service 4.display service");
		int mainMenuChoice = scanner.nextInt();
		
		switch (mainMenuChoice) {
		case 1:
			product = ProductService.createProduct();
			break;
		case 2:
			ProductService.displayProduct(product);
			break;
		case 3:
			service = ServiceService.createService();
			break;
		case 4:
			ServiceService.displayService(service);
			break;
		}
		System.out.println("go back to menu" );
		goToMainMenu= scanner.next().charAt(0);
		}while(goToMainMenu == 'y');

	}

}
