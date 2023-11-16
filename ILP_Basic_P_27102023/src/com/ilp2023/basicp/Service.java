package com.ilp2023.basicp;

import java.util.Scanner;

public class Service {

	public Product addp() {
		Product p = new Product();
		Scanner scn = new Scanner(System.in);
		System.out.println("enter details ID:");
		p.productId = scn.nextLine();
		System.out.println("enter details Name:");
		p.productName = scn.nextLine();
		System.out.println("enter details price:");
		p.productPrice = scn.nextInt();
		System.out.println("enter details qty:");
		p.productQty = scn.nextInt();
		return p;

	}

	public void dispp(Product p) {
		System.out.println("ID     name  price   Qty");
		System.out.println(p.productId + "    " + p.productName + "    " + p.productPrice + "    " + p.productId);

	}

	public Product buy(Product p) {
		Scanner scn = new Scanner(System.in);
		int q;
		System.out.println("enter qty to buy :");
		q = scn.nextInt();
		if (isnull(p.productQty))
			System.out.println("No products");
		else if (q > p.productQty)
			System.out.println("Not enough stock. Remaining :" + p.productQty);
		else {
			System.out.println("Bill amount = " + q * p.productPrice);
			p.productQty = p.productQty - q;
		}
		return p;
	}

}
