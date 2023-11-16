package com.ilp.basicp.assignment;

import java.util.Scanner;

public class Q13Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter n:");
		int n=scanner.nextInt();
		if(n%2==0)
			--n;
		int j;
		int half=n/2;
		for(int i=1;i<=n/2+1;i++)  //upper
		{	
			for(j=0;j<half;j++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print(" *");
			System.out.println();
			half--;
		}
		half=1;
		for(int i=n/2;i>0;i--)   //lower
		{	
			
			for(j=0;j<half;j++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print(" *");
			System.out.println();
			half++;
		}
	}

}
