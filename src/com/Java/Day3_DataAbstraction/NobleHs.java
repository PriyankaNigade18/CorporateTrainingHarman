package com.Java.Day3_DataAbstraction;
//Multiple inheritance in java
public class NobleHs implements IMA,USMA
{
	
	public void medical()
	{
		System.out.println("NobleHs.....medical()");
	}

	@Override
	public void physio() {

		System.out.println("NobleHs.....physio()");

		
	}

	@Override
	public void dental() {
		System.out.println("NobleHs.....dental()");
		
	}

	@Override
	public void nero() {
		System.out.println("NobleHs.....nero()");

		
	}

	@Override
	public void cardio() {
		System.out.println("NobleHs.....cardio()");
		
	}

	@Override
	public void covid19Test() {
		System.out.println("NobleHs.....covid19Test()");

		
	}

}
