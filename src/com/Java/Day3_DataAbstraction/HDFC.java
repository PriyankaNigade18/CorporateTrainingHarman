package com.Java.Day3_DataAbstraction;

public class HDFC implements RBI
{
	
	
	public void custDetails()
	{
		System.out.println("HDFC......CustDetails()");
	}

	@Override
	public void deposite() {
		System.out.println("HDFC.....deposite()");
		
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC.....Withdraw()");
		
		
	}

	@Override
	public void rateOfInterest() {
		System.out.println("HDFC.....rateOfInterest 8%()");
		
	}

}
