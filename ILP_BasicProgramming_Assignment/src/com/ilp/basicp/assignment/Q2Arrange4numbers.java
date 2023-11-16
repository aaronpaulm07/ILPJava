package com.ilp.basicp.assignment;

import java.util.Scanner;

public class Q2Arrange4numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[4];
		int i,j,temp;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter 4 numbers:");
		for(i=0;i<4;i++)
		{
			array[i]= scanner.nextInt();
		}
		
		for(i=0;i<4;i++)
			for(j=0;j<3;j++)
			{
				if(array[j]>array[j+1])
					{temp=array[j];
					 array[j]=array[j+1];
					 array[j+1]=temp;
					}
			}
		System.out.println("sorted in ascending numbers:");
		for(i=0;i<4;i++)
		{
			System.out.println(array[i]);
		}
		for(i=0;i<4;i++)
			for(j=0;j<3;j++)
			{
				if(array[j]<array[ j+1])
					{temp=array[j];
					 array[j]=array[j+1];
					 array[j+1]=temp;
					}
			}
		System.out.println("sorted in descding numbers:");
		for(i=0;i<4;i++)
		{
			System.out.println(array[i]);
		}
	}

}
