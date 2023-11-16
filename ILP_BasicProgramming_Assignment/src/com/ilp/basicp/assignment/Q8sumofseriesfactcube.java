package com.ilp.basicp.assignment;

import java.util.Scanner;

public class Q8sumofseriesfactcube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter n:");
		n=scanner.nextInt();
		float sum=0,denominator=0;
		for(float i=1;i<=n;i++)
		{
		  denominator=(float) (Math.pow(i,i*2)+factorial(i));
		  sum=sum+ i/denominator;	
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


