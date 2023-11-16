package com.ilp.basicp.assignment;

import java.util.Scanner;

public class Q3sumofseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter n:");
		n=scanner.nextInt();
		int sum=0;
		for(int i=1,k=0;i<=n;i=i+2,k++)
		{
			if(k%2==0)
				sum=sum+i;
			else 
				sum=sum-i;
		}
		System.out.println("sum="+sum);
	}

}
