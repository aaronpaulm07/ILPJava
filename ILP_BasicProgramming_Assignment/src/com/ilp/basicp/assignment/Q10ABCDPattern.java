package com.ilp.basicp.assignment;

import java.util.Scanner;

public class Q10ABCDPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter n:");
		int n=scanner.nextInt();
		int space,i,j;
		char letter='A';
		for(i=0;i<n;i++)
		{	letter='A';
			//space=n-1;
			for(j=n-1-i;j>0;j--)
				System.out.print(" ");
		    for(j=0;j<=i;j++,letter++) 
			  System.out.print(letter+"");
		    System.out.println();
		}
	}
	}


