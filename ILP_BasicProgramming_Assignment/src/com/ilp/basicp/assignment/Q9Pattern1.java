package com.ilp.basicp.assignment;

import java.util.Scanner;

public class Q9Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter n:");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++)
		{	for(int j=i;j>0;j--)
				System.out.print(j+" ");
		   System.out.println();
		}
	}

}
