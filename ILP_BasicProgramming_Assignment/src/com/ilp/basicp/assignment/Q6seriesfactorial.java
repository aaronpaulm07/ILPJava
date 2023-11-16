package com.ilp.basicp.assignment;

import java.util.Scanner;

public class Q6seriesfactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter n:");
		n=scanner.nextInt();
		float sum=0,g;
		for(int i=1;i<=n;i++)
		{ g=i/factorial(i);
		  sum=sum+g ;	
		}
		System.out.println("sum="+sum);
	}
	static float factorial(int n)
	{ float i;
		for( i=1;n>0;n--)
			i=i*n;
		return i;

	}

}
