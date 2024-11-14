package com.Java.Day2;

public class BuilderPatternInJava 
{
	//method returns current class instance/object
	public BuilderPatternInJava startBrowser()
	{
		System.out.println("Browser open!");
		return this;
	}
	
	public BuilderPatternInJava runApplication()
	{
		System.out.println("Application is running!");
		return this;
	}
	
	public void stopBrowser()
	{
		System.out.println("Browser stoped!");
	}
	public static void main(String[] args)
	{
		BuilderPatternInJava b1=new BuilderPatternInJava();
		b1.startBrowser().runApplication().stopBrowser();
		

	}

}
