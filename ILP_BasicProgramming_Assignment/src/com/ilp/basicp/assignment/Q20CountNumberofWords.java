package com.ilp.basicp.assignment;

import java.util.Scanner;

public class Q20CountNumberofWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string;
		int i;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter string:");
		string=scanner.nextLine();
//		for(i=0;i<string.length;i++)
//		{
//			string[i]= scanner.nextInt();
//		}
		int numberofwords=0;
		for(i=0;i<string.length();i++)
		{
			if(string.charAt(i)==' ' || string.charAt(i)=='\0' )
				numberofwords++;
			
		}
		if(string.charAt(0)==' ')
			numberofwords--;
		System.out.println("number of words:"+(numberofwords+1));

	}

}
