package com.ilp.basicp.assignment;

import java.util.Scanner;

public class Q18RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[15];
		int i,j,temp;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter size of array:");
		int len=scanner.nextInt();
		System.out.println("enter  numbers:");
		for(i=0;i<len;i++)
		{
			array[i]= scanner.nextInt();
		}
		
		for(i=0;i<len;i++)
			for(j=i+1;j<len;j++)
			{
				if(array[i]==array[j] && array[i]==array[j+1] )
					{
					  for(int k=j;k<len-1;k++)     //shifting
						  array[k]=array[k+2];
					  len--;
					}
				else if(array[i]==array[j]  )
				{
					  for(int k=j;k<len-1;k++)     //shifting
						  array[k]=array[k+1];
					  len--;
					}
			}
		System.out.println("unique numbers:");
		for(i=0;i<len;i++)
		{
			System.out.println(array[i]);
		}
	}

}
