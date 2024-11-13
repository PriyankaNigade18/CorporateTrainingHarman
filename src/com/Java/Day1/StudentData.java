package com.Java.Day1;

public class StudentData 
{
	//data
	int id;
	String name;
	
	//method
	public void display()
	{
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
	}
	
	public static void main(String args[])
	{
		/*
		 * To execute member of  a class object need to be create
		 * classname refvariblename=new classname();
		 */
		
		//object
		StudentData s1=new StudentData();
		//s1.display();
		
		s1.id=101;
		s1.name="Kiran";
		
		s1.display();
		
		System.out.println("**************************");
		
		StudentData s2=new StudentData();
		s2.id=102;
		s2.name="Smita";
		s2.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
