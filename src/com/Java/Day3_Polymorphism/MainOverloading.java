package com.Java.Day3_Polymorphism;

public class MainOverloading
{
	//origin
	public static void main(String[] args)
	{
		System.out.println("This is main() with String arguments");
		
		int arr[]= {10,20,30};
		main(arr);

	}
	
	//normal method
	public static void main(int[] args)
	{
		System.out.println("This is main() with int arguments");

	}

}
