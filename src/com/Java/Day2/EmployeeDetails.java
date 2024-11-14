package com.Java.Day2;

public class EmployeeDetails
{
	int id;
	String name;
	
	//constructor
	/*
	 * this keyword is used to refer current class instance variable and method
	 */
	public EmployeeDetails(int id,String name)//local variable
	{
		//initialize instance variable
//		id=id;
//		name=name;
		this.id=id;
		this.name=name;
		
		
	}
	//Business logic
	public void display()
	{
		System.out.println("Employee id is: "+id);
		System.out.println("Employee name is: "+name);
	}
	public static void main(String[] args)
	{
		EmployeeDetails e1=new EmployeeDetails(101,"Sarang");
		e1.display();
		
		EmployeeDetails e2=new EmployeeDetails(102,"Sara");
		e2.display();

	}

}
