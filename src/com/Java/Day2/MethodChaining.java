package com.Java.Day2;

public class MethodChaining 
{
	public void m1()
	{
		System.out.println("M1 is calling!");
		m2();
	}

	
	public void m2()
	{
		System.out.println("M2 is calling!");
		m3();
	}

	
	public void m3()
	{
		System.out.println("M3 is calling!");
		//m1();//java.lang.StackOverflowError
		
	}

	public static void main(String[] args)
	{
		MethodChaining obj=new MethodChaining();
		obj.m1();

	}

}
