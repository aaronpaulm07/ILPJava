package com.ilp.basicp.assignment;

import java.util.Scanner;

public class Q16CountOccurenceofElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[20];
		int i,j;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter size of array:");
		int length= scanner.nextInt();
		System.out.println("enter array:");
		for(i=0;i<length;i++)
		{
			array[i]= scanner.nextInt();
		}
		array = ascending(array,length);
		int count=0;
		for(i=0;i<length;i++)
		{	for(j=i;j<length;j++)
			{
				if(array[i]==array[j])
					count++;
			}
		   
		System.out.println(array[i]+" occurs "+count+" times.");
		if(count>1)
			i=i+count-1;
		count=0;
		}
		
	}
		static int[] ascending(int array[],int l)
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
			return array;
	     }

}
