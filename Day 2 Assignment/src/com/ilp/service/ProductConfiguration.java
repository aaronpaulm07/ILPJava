package com.ilp.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Product;
import com.ilp.entity.Services;

public class ProductConfiguration {
	public static Product createProduct(ArrayList<Services> availableServices) {
		Scanner scanner = new Scanner(System.in); 
		ArrayList<Services> serviceList = new ArrayList<Services>();
		
		int ch;
		char more;
		System.out.println("Enter product Name:");
		String name = scanner.nextLine();
		System.out.println("Enter product code:");
		String code = scanner.nextLine();
		System.out.println("Available Services :");
		do {
			System.out.println("Available Services :");
			for(Services service: availableServices)
				System.out.println(service.getServiceCode()+"  "+service.getServiceName());
			System.out.println("Enter service code to add");
			ch= scanner.nextInt();
			serviceList.add(availableServices.get(ch));
			System.out.println("do you want to add more services(y/n)?");
			more =scanner.next().charAt(0);
	      
	        }while (more == 'y');
		Product product = new Product(name,code,serviceList);
		return product;
	}
	
	public static Product selectProduct(ArrayList<Product> productList) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select Product from list :");
		for(Product product: productList)
		{
			System.out.println(product.getProductCode()+ "  "+ product.getProductName());
		}
		System.out.println("enter index of product required");
	    int ch = scanner.nextInt();
		return productList.get(ch);
	}
	
		public static ArrayList<Services> selectServices(ArrayList<Services> availableServices) {
			Services services =new Services("0","0",0);
			char moreServices;
			Scanner scanner = new Scanner(System.in);
			int ch=0;
			ArrayList<Services> servicesList = new  ArrayList<Services>();
			do {
				for(Services service:availableServices) 
					System.out.println(services.getServiceCode()+" "+services.getServiceName()+" "+services.getRate());
				ch = scanner.nextInt();
			    services = availableServices.get(ch);
				servicesList.add(services);
				System.out.println("Add more services (y/n)");
				moreServices = scanner.next().charAt(0);
			}while(moreServices == 'y');
			
			return servicesList ;
			
		}
		public static void ServicesSelected(ArrayList<Services> servicesList) {
		
			for(Services services: servicesList)
			{
				System.out.println(services.getServiceCode()+" "+services.getServiceName()+" "+services.getRate());
			}
	}
		public static ArrayList<Services> defaultServices() {
			ArrayList<Services> servicesList = new ArrayList<Services>();
			Services services =new Services("0","Cash Deposit",0);
			servicesList.add(services);
//			services.setServiceCode("1");
//			services.setServiceName("Cash Withdrawl");
//			services.setRate(20);
			services =new Services("1","Cash Withdraw",10);
			servicesList.add(services);
//			services.setServiceCode("2");
//			services.setServiceName("ATM Withdrawl");
//			services.setRate(40);
			services =new Services("2","Internet Banking",50);
			servicesList.add(services);
//			services.setServiceCode("3");
//			services.setServiceName("Internet Banking");
//			services.setRate(10);
			services =new Services("3","Online Banking",40);
			servicesList.add(services);
//			services.setServiceCode("4");
//			services.setServiceName("Online Banking");
//			services.setRate(50);
//			services =new Services("4","Online Banking",40);
//			servicesList.add(services);
			return servicesList;
		 }
		public static ArrayList<Services> createServices(ArrayList<Services> availableServices)
		{
			Scanner scanner = new Scanner(System.in);
			Services services =new Services("0","0",0);
			System.out.println("Enter service code");
			String code=scanner.nextLine();
			System.out.println("Enter service Name");
			String name=scanner.nextLine();
			System.out.println("Enter service rate");
			int rate =scanner.nextInt();
			services.setServiceCode(code);
			services.setServiceName(name);
			services.setRate(rate);
			availableServices.add(services);
			return availableServices;
		}
	}

