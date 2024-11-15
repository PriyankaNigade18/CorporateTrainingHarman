package com.Java.Day3_Polymorphism;

public class CompileTimePoly 
{
	/*
	 * Method overloading is possible only when method has same name
	 * and different signature
	 * 1.Number of parameters
	 * 2.Type of parameters
	 * 3.Order of Parameters
	 * 
	 * Method Overloading
	 * Operator Overloading (+)
	 * Main() Overloading is possible but technically it is not required
	 * Constructor overloading is possible but overriding is not possible
	 */
	public void add()//0 parameter
	{
		int a=10, b=20;
		System.out.println("Addition is: "+(a+b));
	}
	// 1.Number of parameters
	public void add(int a,int b)//2 parameter
	{
		System.out.println(a+b);
	}
	
	public void add(int a,int b ,int c)
	{
		System.out.println(a+b+c);
	}

	 //2.Type of parameters
	public void add(double a,int b)//2 parameter
	{
		System.out.println(a+b);
	}
	
	//3.Order of Parameters
	public void add(int a,double b)//2 parameter
	{
		System.out.println(a+b);
	}
	
	
	public CompileTimePoly()
	{
		
	}
	
	public CompileTimePoly(String n)
	{
		
	}
	
	public CompileTimePoly(String n,int i)
	{
		
	}
	public static void main(String[] args)
	{
		CompileTimePoly c1=new CompileTimePoly();
		c1.add();
		c1.add(100,20);
		c1.add(100.22,220);
		c1.add(100,445.76780);
		c1.add(24,560,67);


	}

}
