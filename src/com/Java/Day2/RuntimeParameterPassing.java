package com.Java.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RuntimeParameterPassing

{
	public int add(int a,int b)
	{
		//System.out.println("Addition is: "+(a+b));
		return a+b;
	}

	public static void main(String[] args) throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		RuntimeParameterPassing r1=new RuntimeParameterPassing();
		int result=r1.add(num1,num2);
		System.out.println("Addition is: "+result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("Enter your name: ");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		
		System.out.println("Enter your phone number");
		long phno=sc.nextLong();
		System.out.println("Your details are: ");
		System.out.println("Hello "+name);
		System.out.println("Calling on "+phno);
		
		
		
		
		/*
		//Technique2: BufferedReader Class
		
		System.out.println("Enter your phone number");
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		String data=br.readLine();
		//string to long conversion-wrapper class
		long phno=Long.parseLong(data);
		System.out.println("your phone number is: "+phno);
		*/
		
		
		
		
		
		
		
/*
		//Technique1: System.in.read()- reads only single character
		System.out.println("Enter your age: ");
		int age=System.in.read();
		System.out.println("Hello Your age is: "+age);
*/
	}

}
