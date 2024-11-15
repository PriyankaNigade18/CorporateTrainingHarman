package com.Java.Day3_Polymorphism;

public class AmazonSearchTest {

	public static void main(String[] args)
	{
			AmazonSearch a1=new AmazonSearch();
			a1.search();
			a1.search("Iphone");
			a1.search(900000);
			a1.search(10000,"bag");
			a1.search("laptop", 90000);
			a1.search("watch","Rado");
			

	}

}
