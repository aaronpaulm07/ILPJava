package com.ilp.basicp.assignment;

import java.util.Scanner;

public class Q4sumofseries3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter n:");
		n=scanner.nextInt();
		int sum=0;
		int fibanaccilow=0,fibanaccihigh=1,fibanaccisum=0;
		for(int i=1,k=0;k<n;i=i+2,k++)
		{  	//System.out.println(fibanaccihigh);
		    sum=sum+ fibanaccihigh*fibanaccihigh*fibanaccihigh;
			fibanaccisum=fibanaccilow + fibanaccihigh;
			fibanaccilow= fibanaccihigh;
			fibanaccihigh=fibanaccisum;
		}
		System.out.println("sum="+sum);
	}

}
