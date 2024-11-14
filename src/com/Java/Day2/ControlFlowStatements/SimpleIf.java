package com.Java.Day2.ControlFlowStatements;

import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args)
	{
		//for single true condition use simple if
		System.out.println("Program started!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("valid age");
		}

		
		System.out.println("Program ended!");
	}

}
