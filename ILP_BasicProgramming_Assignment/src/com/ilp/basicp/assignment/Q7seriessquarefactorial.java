package com.ilp.basicp.assignment;

import java.util.Scanner;

public class Q7seriessquarefactorial {

	public static void main(String[] args) {
		
		int n;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter n:");
		n=scanner.nextInt();
		float sum=0;
		for(float i=1;i<=n;i++)
		{
		  sum= (sum + (i/factorial(i*i)));	
		}
		System.out.println("sum="+sum);
	}
	static float factorial(float n)
	{ float i;
		for( i=1;n>0;n--)
			i=i*n;
		return i;

	}
	

}
