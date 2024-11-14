package com.Java.Day2;

public class ThisKeywordDemo1 
{
	//this keyword used to invoke current class method
	public void m1()
	{
		System.out.println("M1 is calling!");
		//m2();
		this.m2();
	}
	
	public void m2()
	{
		System.out.println("M2 is calling!");
	}

	public static void main(String[] args)
	{
		ThisKeywordDemo1 t1=new ThisKeywordDemo1();
		t1.m1();

	}

}
