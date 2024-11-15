package com.Java.Day3_Inheritance;


//final class Demo
class Demo
{
	final int x=100;
	
	public final void color()
	{
		System.out.println("Red");
	}
}


public class FinalKeyword extends Demo
{

//	public void color()
//	{
//		System.out.println("Blue");
//	}
	public static void main(String[] args)
	{

		FinalKeyword f1=new FinalKeyword();
		f1.color();
		//f1.x=200;
		
		System.out.println(f1.x);
		
		
		

	}

}
