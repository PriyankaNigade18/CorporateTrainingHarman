package com.Java.Day3_Polymorphism;

public class AmazonSearch
{
	public void search()
	{
		System.out.println("Search product by general categaory");
	}
	
	public void search(String pname)
	{
		System.out.println("Search product by product name: "+pname);
	}
	
	public void search(int price)
	{
		System.out.println("Search product by product price: "+price);
	}
	
	public void search(String pname,int price)
	{
		System.out.println("Search product by product name: "+pname+" & by product price: "+price);
	}
	
	public void search(String pname,String bname)
	{
		System.out.println("Search product by product name: "+pname+" & by product brandname: "+bname);
	}

	public void search(int price,String pname)
	{
		System.out.println("Search product by product name: "+pname+" & by product price: "+price);
	}
}
