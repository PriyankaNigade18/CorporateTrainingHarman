package com.Java.Day2;

public class CompileTimeParameterPassing
{

	public void add()//0 parameter
	{
		int a=10,b=20;
		System.out.println("Addition is: "+(a+b));
	}
	
	public void sub(int a,int b)//2 parameters a & b are local variable a=100 b=40
	{
		System.out.println("Subtraction is: "+(a-b));
	}
	
	public void mul(int a,int b)
	{
		System.out.println("Multiplication is: "+(a*b));
	}
	/*
	 * return keyword is used to return values from method
	 * at the time return change return type of method
	 * return keyword return the result to that calling function
	 */
	public int div(int a,int b)//a=100 b=20
	{
		int c=a/b;
		return c;
	}
	public String info(String msg)
	{
		
		System.out.println("This is method with return keyword");
		return msg;
	}
	
	public float op(int a,float b)
	{
		float c=a+b;
		return c;
	}
	
	public static void main(String[] args)
	{
		CompileTimeParameterPassing c1=new CompileTimeParameterPassing();
		c1.add();
		/*
		 * When arguments are passed during calling that method is called compiled time parameter passing
		 */
		c1.sub(100,40);
		c1.mul(100,100);
		int result=c1.div(100,20);
		System.out.println("Division is: "+ result);
		

		String data=c1.info("Hello All!");
		//System.out.println(data);
		c1.info(data);
		
		System.out.println(c1.info(data));
		
		
		//System.out.println(c1.info("Hello All"));
		
		
		
	}

}
