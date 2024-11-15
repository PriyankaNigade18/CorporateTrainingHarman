package com.Java.Day3_DataAbstraction;

public class Customer extends Book 
{

	public void details()
	{
	
		System.out.println("Customer details....");
			
	}
	
	@Override
	public void sell() {

		System.out.println("child class implemented Sell()");
		
	}
	
	public static void main(String[] args) {

		System.out.println("Scenario1: Child class ref and Child  class Object-child+Parent");

		Customer c1=new Customer();
		c1.info();
		c1.sell();
		c1.details();

		System.out.println("Scenario2: Parent class ref and Parent class Object-Invalid");
		//Book b1=new Book();
		
		System.out.println("Scenario3: Parent class ref and Child class Object-valid");

		Book b1=new Customer();
		b1.info();
		b1.sell();
		
		
	}

	

}
