package com.Java.Day3_DataAbstraction;

public class TestBank {

	public static void main(String[] args)
	{
		//child class ref and child class object
			HDFC h1=new HDFC();
			h1.custDetails();//individual
			h1.deposite();//inherited abstract method
			h1.withdraw();//inherited abstract method
			h1.rateOfInterest();//inherited abstract method
			//h1.x=200;
			System.out.println(h1.x);
			System.out.println("*******************");
			
			
			//RBI r1=new RBI();
			RBI r1=new HDFC();
			r1.deposite();
			r1.withdraw();
			r1.rateOfInterest();

	}

}
