package com.Java.Day1;

public class TypeCastingDemo {

	public static void main(String[] args) 
	{
		/*
		 * 1.primitive to primitive
		 * -------------------------------
		 * 		1.implicit
		 * 		2.Explicit
		 * 2.Object to primitive
		 * 
		 * 3.Primitive to Object
		 * 
		 */

		//implicit --->automatic conversion
		//byte-->short--->char--->int-->long-->float--->double
		
		int x=987665544;
		long l1=x;
		System.out.println("int to long conversion: "+l1);
		
		float f1=l1;
		System.out.println("long to float conversion: "+f1);
		
		int z=95;
		float f2=z;
		System.out.println("int to float conversion: "+f2);
		
		char c1='z';//z
		int num=c1;//122
		System.out.println("char to int conversion: "+num);
		
		
		//explicit casting
		int y=(int)l1;
		System.out.println("long to int conversion: "+y);
		
		int s=98;//4byte
		char ch=(char) s;//2byte
		System.out.println("int to character conversion: "+ch);
		
		double d1=98.76655433;
		float ff1=(float) d1;
		System.out.println("double to float conversion: "+ff1);
		
		
		
		
		
		
		
	}

}
