package com.ilp.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Product;
import com.ilp.entity.Services;

public class ProductConfiguration {
	public static Product selectProduct() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select Product /n 1.Savings max 2.Current 3.Loan");
	    int ch = scanner.nextInt();
		Product product  = new Product("0","0",null);
		switch(ch)
		{
		case 1 : product.setProductCode("1");
				 product.setProductName("Savings max");
				 product.setServiceList(ServicesService.selectServices());
				 break;
		case 2 : product.setProductCode("2");
				product.setProductName("Current");
				product.setServiceList(ServicesService.selectServices());
				break;
		case 3 : product.setProductCode("3");
		 		product.setProductName("Loan");
		 		product.setServiceList(ServicesService.selectServices());
		 		break;
		}
		return product;
	}
	public class ServicesService {
		public static ArrayList<Services> selectServices() {
			Services services =new Services("0","0",0);
			char moreServices;
			Scanner scanner = new Scanner(System.in);
			int ch=0;
			ArrayList<Services> servicesList = new  ArrayList<Services>();
			do {
				System.out.println("Select Product /n 1.Internet Banking 2.Cash Withdrawl 3.Cash Deposit 4.ATM Withdrawl 5.Online Banking");
				ch= scanner.nextInt();
				switch(ch) {
				case 1: 		
					services.setServiceCode("1");
					services.setServiceName("Internet Banking");
					services.setRate(10);
					break;
				case 2: 		
					services.setServiceCode("2");
					services.setServiceName("Cash Withdrawl");
					services.setRate(20);
					break;
				case 3: 		
					services.setServiceCode("3");
					services.setServiceName("Cash Deposit");
					services.setRate(30);
					break;
				case 4: 		
					services.setServiceCode("4");
					services.setServiceName("ATM Withdrawl");
					services.setRate(40);
					break;
				case 5: 		
					services.setServiceCode("5");
					services.setServiceName("Online Banking");
					services.setRate(50);
					break;
				}
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
	}
}
