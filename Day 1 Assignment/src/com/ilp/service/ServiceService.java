package com.ilp.service;

import java.util.Scanner;

import com.ilp.entity.Service;

public class ServiceService {
	public static Service createService() {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter price :");
		double price = scanner.nextDouble();
		Service service = new Service("001","P1",price);
		return service ;
	}

	public static void displayService(Service service) {
		// TODO Auto-generated method stub
		System.out.println("Service no : " +service.getServiceId() + "   Service name:"+service.getServiceName()+"     Service Pricee:"+ service.getServicePrice());
	
}

}