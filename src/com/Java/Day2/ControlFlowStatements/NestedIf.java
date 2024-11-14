package com.Java.Day2.ControlFlowStatements;

public class NestedIf {

	public static void main(String[] args)
	{

		int marks=83;
		
		if(marks>=90)
		{
			if(marks>=95)
			{
				System.out.println("A++");
			}else
			{
				System.out.println("A");
			}
		}else
		{
			System.out.println("B");
		}

	}

}
