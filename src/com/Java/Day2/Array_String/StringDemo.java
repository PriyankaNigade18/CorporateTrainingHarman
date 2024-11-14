package com.Java.Day2.Array_String;

public class StringDemo {

	public static void main(String[] args)
	{

		String s1="Hello";
		String s2="Hello";
		
		System.out.println(s1==s2);//object id-true
		
		System.out.println(s1.equals(s2));//data-true
		
		String s3=new String("Hello");//heap
		
		System.out.println(s1==s3);//false
		
		//String immutable class
		
		s1=s1+" All";
		
		System.out.println(s1==s2);//false
		
		//Methods
		String ss1="Hello All";
		System.out.println("Length of string: "+ss1.length());//9
		
		//convert the string into upper case lower case
		//toLowerCase()  toUpperCase()
		System.out.println(ss1.toUpperCase());
		System.out.println(ss1.toLowerCase());
		
		//equality- equals()  equalsIgnoreCase()
		String ss2="Hello All";
		System.out.println(ss1.equals(ss2));//true
		System.out.println(ss1.equalsIgnoreCase(ss2));//true
		
		String act="Selenium WebDriver is WebUI automation library";
		
		//contains()- partial matching
		System.out.println(act.contains("WebUI"));//true
		System.out.println(act.contains("testng"));//false
		
		//startsWith()- prefix value
		System.out.println(act.startsWith("Selenium"));//true
		System.out.println(act.startsWith("Sele"));//true
		System.out.println(act.startsWith("S"));//true
		System.out.println(act.startsWith("nium"));//false
		System.out.println(act.startsWith("WebDriver"));//false
		
		//endsWith()- suffix value
		System.out.println(act.endsWith("library"));//true
		System.out.println(act.endsWith("lib"));//false
		System.out.println(act.endsWith("ry"));//true
		
		//trim()- ignore white space before and after string
		
		String ss3="      Welcome All       ";
		System.out.println(ss3);
		System.out.println(ss3.trim());
		
		//concat() or +
		String s5="Welcome to learn OOP Principles!";
		System.out.println(s1+" "+s5);
		
		System.out.println(s1.concat(" "+s5));
		
		
		//charAt(index)
		System.out.println(s5.charAt(11));//l
			
		//Substring()
		System.out.println(s5.substring(11));
		System.out.println(s5.substring(0,12));
		
		//split(regexp): pattern matching!
		
		String tools="Selenium,Postman,Appium,Cypress,Playwright";
		System.out.println(tools);
		
		String arr[]=tools.split(",");
		
		for(String i:arr)
		{
			System.out.println(i);
		}
		
		System.out.println(arr[2]);
		
		String orderMessage="Your total bill is 2800";
		/*
		 * compare bill amount is less that 3000?
		 */
		
		String data=orderMessage.split(" ")[4];
		
		System.out.println(data);
		//string--->int
		
		int amount=Integer.parseInt(data);
		
		if(amount<3000)
		{
			System.out.println("Amount is correct!");
		}
		
		
		/*
		 * StringBuffer and StringBuilder both are mutable classes
		 * 
		 * How to reverse a string using method
		 * 
		 */
		
		StringBuilder br=new StringBuilder("Hello");
		br.append( 1234);
		System.out.println(br);
		
		System.out.println(br.reverse());
		
		
		//How to reverse string without method
		String name="Java slenium";
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)
			
		{
			rev=rev+name.charAt(i);
		}
		
		
		System.out.println("Reverse of string "+name+" is: "+rev );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
