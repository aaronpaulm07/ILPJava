package com.ilp.basicp.assignment;

import java.util.Scanner;

public class Q14FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array;
		int i,j;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter string:");
		array =scanner.nextLine();
		System.out.println("enter element:");
		char element =scanner.next().charAt(0);
		int count=0;
		for(i=0;i<array.length();i++)
		{
			if(array.charAt(i)==element)
				{
				  count++;
				}
			
		}
		System.out.println("count of "+element+" : "+ count);


 }
}