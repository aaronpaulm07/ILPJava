package com.ilp.basicp.assignment;

import java.util.Scanner;

public class Q12Pattern123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of rows:");
		int n = scanner.nextInt();
		int k = 1;
		for (int i = 1; i <= n; i++) 
		{
			for (int j = 0; j <= n-i; j++) 
			{
				if (j < n - i)
					System.out.print(" ");
				else 
				  for(int a=1;a<=i;a++)
					{ System.out.print(k+" ");
					  k++;
					}
				
			}
			System.out.println();

		}
	}
}
