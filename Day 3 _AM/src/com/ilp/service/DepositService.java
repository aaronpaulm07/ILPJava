package com.ilp.service;

public class DepositService extends AccountService{

	
	public static void depositMoney (double amt ,String checkNo) {
		System.out.println("Amount "+amt+ "  deposited through check");
	}
	public static void depositMoney (double amt) {
		System.out.println("Amount "+amt+ "  deposited through drop in");
	}
	public static void depositMoney (double amt , String DDname, String name) {
		System.out.println("Amount "+amt+ "  deposited through DD");
	}
	@Override
	public void freeTransaction() {
		// TODO Auto-generated method stub
		System.out.println("3 free transactions");
	}
	
}
