package com.ilp.basicp.assignment;

import java.util.Scanner;

public class Q11Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter n:");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++)
		{	for(int j=n;j>i;j--)
				System.out.print(j+" ");
		   System.out.println();
		}
	}

}
