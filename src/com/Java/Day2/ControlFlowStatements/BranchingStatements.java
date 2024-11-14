package com.Java.Day2.ControlFlowStatements;

public class BranchingStatements {

	public static void main(String[] args) 
	{

		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;//exit from the loop
			}else
			{
				System.out.println(i);//1 2 3 4
			}
		}
		
		System.out.println("************************");
		
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;//skip that part of code
				
			}else
			{
				System.out.println(i);
			}
		}
		
		
		
		
		

	}

}
