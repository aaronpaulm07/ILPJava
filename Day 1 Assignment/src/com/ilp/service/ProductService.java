package com.ilp.service;

import java.util.Scanner;

import com.ilp.entity.Product;

public class ProductService {
	public static Product createProduct() {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter price :");
		double price = scanner.nextDouble();
		Product product = new Product("001","P1",price);
		return product ;
	}

	public static void displayProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println("product no : " +product.getProductId() + "   Product name:"+product.getProductName()+"     ProductPricee:"+ product.getProductPrice());
	}
}
