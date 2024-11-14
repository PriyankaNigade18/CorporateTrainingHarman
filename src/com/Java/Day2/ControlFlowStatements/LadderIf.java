package com.Java.Day2.ControlFlowStatements;

import java.util.Scanner;

public class LadderIf {

	public static void main(String[] args)
	{
		//Ladder if help us to match with multiple conditions
	
		/*
		 * String is class
		 * String equality
		 * 1.equals(): exact matching and it is case sensitive
		 * 2.equalsIgnoreCase(): exact matching and it is case insensitive
		
		
		String s1="Hello";
		String s2="hello";
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		*/
				
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bname=sc.nextLine();
		
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test case is executing on "+bname);
		}
		else if(bname.equalsIgnoreCase("edge"))
		{
			System.out.println("Test case is executing on "+bname);

		}else if(bname.equalsIgnoreCase("firefox"))
		{
			System.out.println("Test case is executing on "+bname);

		}else
		{
			System.out.println("Wrong Browser!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
