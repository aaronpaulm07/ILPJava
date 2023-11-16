package com.ilp2023.basicp;
import java.util.*;
public class vowels {

	public static void main(String[] args) {
		char string[]= new char[10];
		int count=0,l=0,i;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter length:");
		l= scanner.nextInt();
		System.out.println("enter charectors:");
		for(i=0;i<l;i++)
		{
			string[i]= scanner.next().charAt(0);
		}
		for(i=0;i<string.length;i++)
		{
			switch(string[i])
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':count++;
			default:break;	
			}
			
		}
		System.out.println("vowels:"+count);
	}

}
