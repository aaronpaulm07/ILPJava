package com.ilp.basicp.assignment;

import java.util.Scanner;

public class Q17SumEquals8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[20];
		int i,j;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter size:");
		int length=scanner.nextInt();
		System.out.println("enter numbers:");
		for(i=0;i<length;i++)
		{
			array[i]= scanner.nextInt();
		}
		for(i=0;i<length;i++)
			for(j=i+1;j<length;j++)
			{	if(array[i]+array[j]==8)
					{ System.out.println(array[i] + "+" +array[j] +"= 8");
					  
					}
		        if(array[i]+array[j]<8)
		        	for(int k=j+1;k<length;k++)      //repeat for more than 3 (diff variables)
					{	if(array[i]+array[j]+array[k]==8)
							{ System.out.println(array[i] + "+" +array[j] + "+" +array[k]+ "= 8");
							  break;
							}
	                 }

			}
	}
}
