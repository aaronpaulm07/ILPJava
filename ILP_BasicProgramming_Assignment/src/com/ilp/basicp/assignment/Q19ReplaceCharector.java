package com.ilp.basicp.assignment;

import java.util.Scanner;
import java.lang.*;

public class Q19ReplaceCharector {

	public static void main(String[] args) {
		String string;
		int i,j;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter string:");
		string=scanner.nextLine();
		System.out.println("enter charector:");
		char charector=scanner.next().charAt(0);
		System.out.println("enter replacing charector:");
		char replacechar=scanner.next().charAt(0);
		int count=0;
		for(i=0;i<string.length();i++)
		{
			if(string.charAt(i)==charector)
				count++;
		}
		string=string.replace(charector,replacechar);		
		System.out.println("number of time replaced:"+ count);
		System.out.println("string: "+string);
		
	}
	}
