package com.ilp.basicp.assignment;

import java.util.Scanner;

public class Q1DescendingNumber {

	public static void main(String[] args) {
		int array[]=new int[3];
		int i,j,temp;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter 3 numbers:");
		for(i=0;i<3;i++)
		{
			array[i]= scanner.nextInt();
		}
		for(i=0;i<3;i++)
			for(j=0;j<2;j++)
			{
				if(array[i]<array[j+1])
					{temp=array[j];
					 array[j]=array[j+1];
					 array[j+1]=temp;
					}
			}
		System.out.println("sorted numbers:");
		for(i=0;i<3;i++)
		{
			System.out.println(array[i]);
		}
	}

}
