package com.Java.Day2;

public class StaticVsInstanceVariable {

	static int count=1;
	
	public StaticVsInstanceVariable()
	{
		System.out.println(count);
		count++;
	}
	

	
	public static void main(String[] args)
	{
		StaticVsInstanceVariable s1=new StaticVsInstanceVariable();
		
		StaticVsInstanceVariable s2=new StaticVsInstanceVariable();
		
		StaticVsInstanceVariable s3=new StaticVsInstanceVariable();
		
		StaticVsInstanceVariable s4=new StaticVsInstanceVariable();
		
		StaticVsInstanceVariable s5=new StaticVsInstanceVariable();
		

	}

}
