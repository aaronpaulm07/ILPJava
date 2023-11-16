package com.ilp.basicp.assignment;

import java.util.Scanner;
import java.lang.*;
public class Q5sumofseriespowern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter n:");
		n=scanner.nextInt();
		double sum=0;
		for(int i=1,k=1;i<=n;i=i+2,k++)
		{
			if(k%2!=0)
				sum=sum+ Math.pow(i,k);
			else 
				sum=sum- Math.pow(i,k);
		}
		System.out.println("sum="+sum);
	}

}
