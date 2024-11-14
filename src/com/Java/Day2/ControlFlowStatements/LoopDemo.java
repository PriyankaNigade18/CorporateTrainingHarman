package com.Java.Day2.ControlFlowStatements;

public class LoopDemo {

	public static void main(String[] args) 
	{
		// print Hello statement 5 times
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}
		
		System.out.println("*************************");
		//interview question
//		for(;;)//true
//		{
//			System.out.println("Hi!");
//		}
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("*************************");
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		System.out.println("*************************");

		//while loop
		
		int i=1;
		while(i<=10)
		{
			System.out.println("Welcome");
			i++;
		}
		
		//print sum of digits num=123 sum=6
		int num=123,rem,sum=0;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			//sum=sum+rem;
			//reverse number
			sum=sum*10+rem;
			//armstrong number
			//sum=sum+rem*rem*rem;
			
		}
		
		
		//System.out.println("Sum of digits are: "+sum);
		
		System.out.println("Reverse of number 123 is: "+sum);
		
		
		System.out.println("************************");
		
		//do while loop - one time execution
		int j=1;
		
		do 
		{
			System.out.println("Hello");
			j++;
			
		}while(j<10);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
