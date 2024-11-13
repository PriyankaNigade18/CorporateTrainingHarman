package com.Java.Day1;

public class WrapperClassDemo {

	public static void main(String[] args)
	{
		//Object to Primitive conversion

		//String s1="100ABC";//s1--string if data is not parseble
		String s1="100";
		System.out.println(s1+100);//100100
		//string to int
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+100);//200
		
		
		String s2="98.77F";
		System.out.println(s2+11.11F);
		
		//string to float
		float f1=Float.parseFloat(s2);
		System.out.println(f1+11.11F);
		
		//string to character
		String s3="Hello";
		char ch=s3.charAt(4);
		System.out.println(ch);
		
		//Integer Object to int
		Integer i1=99;
		int data=i1.intValue();
		System.out.println(data+100);
		
		//Primitive to Object
		int n1=999;
		Integer i2=Integer.valueOf(n1);
		System.out.println(i2);
		
		int x=89;
		//int to String
		System.out.println(x+200);
		String ss1=String.valueOf(x);
		System.out.println(ss1+200);
		
		
		
		
		
		
		
		

	}

}
