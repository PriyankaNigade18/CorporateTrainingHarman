package com.Java.Day2;

public class ThisKeywordDemo2
{
	//this() used to invoke constructor in class
	ThisKeywordDemo2()
	{
		//this("Welcome all");
		System.out.println("Default constructor is calling!");
		
	}
	
	ThisKeywordDemo2(String msg)
	{
		this();
		System.out.println("Parameterized constructor is calling!msg is: "+msg);
	}

	public static void main(String[] args) 
	{

		ThisKeywordDemo2 t1=new ThisKeywordDemo2("Hello");
		
		

	}

}
