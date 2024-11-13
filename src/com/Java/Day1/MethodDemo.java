package com.Java.Day1;

public class MethodDemo
{

	public void accept()
	{
		System.out.println("This is instance method calling!");
	}
	
	
	public static void show()
	{
		System.out.println("This is static method calling!");
	}
	
	
	
	
	public static void main(String[] args)
	{

		show();
		MethodDemo.show();

		MethodDemo m1=new MethodDemo();
		m1.accept();
		//The static method show() from the type MethodDemo should be accessed in a static way
		m1.show();

		

	}

}
