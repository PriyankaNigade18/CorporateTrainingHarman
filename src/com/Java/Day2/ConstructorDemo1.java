package com.Java.Day2;

public class ConstructorDemo1
{
	int id;
	String name;
	
	//constructor
	public ConstructorDemo1()
	{
		System.out.println("Default constructor is caling!");
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
	}
	
	//parameterized 
	public ConstructorDemo1(int i,String n)//local
	{
		id=i;
		name=n;
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
	}

	public static void main(String[] args)
	{
		//default constructor call-jvm
		ConstructorDemo1 c1=new ConstructorDemo1();
		
		//parameterized constructor call
		ConstructorDemo1 c2=new ConstructorDemo1(101,"Sumit");

		ConstructorDemo1 c3=new ConstructorDemo1(102,"Amit");
		
		ConstructorDemo1 c4=new ConstructorDemo1(103,"Kiran");
	}

}
