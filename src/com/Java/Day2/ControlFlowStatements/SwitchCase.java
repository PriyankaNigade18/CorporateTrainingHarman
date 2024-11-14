package com.Java.Day2.ControlFlowStatements;

import java.util.Scanner;

public class SwitchCase 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Performance Number");
		int num=sc.nextInt();
		

		switch (num)
		{
		case 1:
			System.out.println("Poor performance");
			break; // exit from switch
		case 2:
			System.out.println("Need to Improve performance");
			break;
		case 3:
			System.out.println("Good performance");
			break;
		case 4:
			System.out.println("Excellent performance");
			break;
		case 5:
			System.out.println("Employee of the Month");
			break;
			

		default:
			System.out.println("Wrong performance number!");
		}
		
				
		
		
		
		
		
	}

}
