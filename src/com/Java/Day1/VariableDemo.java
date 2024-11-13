package com.Java.Day1;

public class VariableDemo
{
	/*
	 * instance variable get the memory at the time of object creation
	 * for seperate object seperate memory for instance variable will create
	 * 
	 */
	
	int id=101;//instance variable
	String name="Sarang";//instance variable
	static String cname="AISSPMS";//static variable
	
	/*
	 * Static variable create only one time memory and same 
	 * memory will share with every seperate object
	 */
	
	
	
	public void show()
	{
		int marks=90;//local
		System.out.println("collage name: "+cname);
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
		System.out.println("marks from show(): "+marks);
	}
	

	public static void main(String[] args)
	{
		System.out.println("collage name: "+cname);
		int marks=100;//local
		System.out.println("Marks from main(): "+marks);
		
		System.out.println("Info from main()");
		//create object
		VariableDemo v1=new VariableDemo();
		v1.show();
		System.out.println("id is: "+v1.id);
		System.out.println("name is: "+v1.name);
		

	}

}
