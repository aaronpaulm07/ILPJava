package com.ilp.basicp.assignment;

import java.util.Scanner;

public class Q15AscendingDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[20];
		int i,j,temp;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter size of array:");
		int length= scanner.nextInt();
		System.out.println("enter numbers:");
		for(i=0;i<length;i++)
		{
			array[i]= scanner.nextInt();
		}
		int choice;
		do{
		System.out.println("enter choice 1.Ascending 2.Descending 3.Exit:");
		choice= scanner.nextInt();
		if(choice==1)
			ascending(array,length);
		else if(choice==2)
			descending(array,length);		
	     }while(choice!=3);
	}
	static void ascending(int array[],int l)
	{  int i,j,temp=0;
		for(i=0;i<l;i++)
			for(j=0;j<l-1;j++)
			{
				if(array[j]>array[j+1])
					{temp=array[j];
					 array[j]=array[j+1];
					 array[j+1]=temp;
					}
			}
		System.out.println("sorted in ascending numbers:");
		for(i=0;i<l;i++)
		{
			System.out.println(array[i]);
		}
		}
	static void descending(int array[],int l)
	{   int i,j,temp=0;
		for(i=0;i<l;i++)
			for(j=0;j<l-1;j++)
			{
				if(array[j]<array[ j+1])
					{temp=array[j];
					 array[j]=array[j+1];
					 array[j+1]=temp;
					}
			}
		System.out.println("sorted in descending numbers:");
		for(i=0;i<l;i++)
		{
			System.out.println(array[i]);
		}
	}

}
