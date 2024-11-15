package com.Java.Day3_DataAbstraction;

public abstract class Book 
{
	/*
	 * Abstract class can have both type implemented and non implement method
	 * Child class implement all non implemented method
	 * Abstract class Object we can create only through child class
	 * Partial abstraction we can achieve
	 *  
	 */
	
	//fully implemented method
	public void info()
	{
		System.out.println("Book is for Java");
	}

	//non implemented method-abstract method
	public abstract void sell();

}
