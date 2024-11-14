package com.Java.Day2.ControlFlowStatements;

public class NestedLoop {

	public static void main(String[] args)
	
	{
		
		for(int i=1;i<=4;i++)//row
		{
			for(int j=1;j<=4;j++)//cell
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("**********************");
		
		for(int i=1;i<=4;i++)//row
		{
			for(int j=1;j<=i;j++)//cell
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		//how to test number is palindrome
		
//		int num=121,rem,sum=0;
//		int temp=num;
//		
//		while(num>0)
//		{
//			rem=num%10;
//			num=num/10;
//			//sum=sum+rem;
//			//reverse number
//			sum=sum*10+rem;
//			
//		}if(temp==sum)
//		{
//			System.out.println(temp+" is a palindrome number");
//		}else
//		{
//			System.out.println(temp+" is not a palindrome number");
//
//		}
//		

		
//		int num=153,rem,sum=0;
//		int temp=num;
//		
//		while(num>0)
//		{
//			rem=num%10;
//			num=num/10;
//			sum=sum+rem*rem*rem;
//			
//		}if(temp==sum)
//		{
//			System.out.println(temp+" is an Armstrong number");
//		}else
//		{
//			System.out.println(temp+" is not an Armstrong number");
//
//		}
		
	}

}
