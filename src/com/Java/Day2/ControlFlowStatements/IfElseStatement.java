package com.Java.Day2.ControlFlowStatements;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		System.out.println("Program started!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Even number: "+num);
		}
		else
		{
			System.out.println("Odd number: "+num);

		}
		
		
		
		
		/*
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("valid age");
		}else
		{
			System.out.println("Invalid age");

		}
*/
		
		System.out.println("Program ended!");

	}

}
