package com.ilp2023.basicp;

import java.util.*;

public class Productmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service s = new Service();
		Product p = null;
		Scanner scanner = new Scanner(System.in);
		int ch = 0;
		while (true) {
			System.out.println(" enter choice /n 1.add /n 2.Display menu /n 3.Buy /n 4. exit");
			ch = scanner.nextInt();
			switch (ch) {
			case 1:
				p = s.addp();
				s.dispp(p);
				break;
			case 2:
				s.dispp(p);
				break;
			case 3:
				p = s.buy(p);
				break;
			default:
				System.exit(0);
			}
		}
	}
}
