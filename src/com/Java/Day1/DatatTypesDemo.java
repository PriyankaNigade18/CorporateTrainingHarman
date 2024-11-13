package com.Java.Day1;

public class DatatTypesDemo {

	public static void main(String[] args) 
	{
		// boolean 1 bit true/false
		boolean status=true;
		System.out.println("Boolean data is: "+status);
		
		status=false;
		System.out.println("Update boolean status: "+status);
		
		System.out.println("*******************************");
	/*
	 * character: single character
	 * 2byte
	 * 
	 * 1.single character
	 * 2.special character
	 * 3.ascii value of character
	 * A-Z= 65 to 90
	 * a-z= 97 to 122
	 * 0-9= 48 to 57
	 */
		
		char c1='A';
		char c2='@';
		char c3=78;//reading as ascii number 78
		
		System.out.println("Character data :"+c1);//A
		System.out.println("Character data :"+c2);//@
		System.out.println("Character data :"+c3);//N
		char c4=65;
		System.out.println(c4);//A
		
		//type casted-->char to int
		int num=c1;//65
		System.out.println(num);//65
		
		System.out.println("*****************************");
		//numeric--->Integral--->Integer
		//byte--short--->int(default)--->long
	
		//byte 1byte -128 to 127
		byte b1=-128;
		byte b2=127;
		byte b3=120;
		byte b4=90;
		//Type mismatch: cannot convert from int to byte
		//byte b5=130;
		System.out.println("Byte data is: "+b1);
		System.out.println("Byte data is: "+b2);
		System.out.println("Byte data is: "+b3);
		System.out.println("Byte data is: "+b4);
		
		//short 2byte -32768 to 32767
		short s1=130;
		short s2=32000;
		short s3=32767;
		
		//Type mismatch: cannot convert from int to short
		//short s4=50000;
		
		System.out.println("short data is: "+s1);
		System.out.println("short data is: "+s2);
		System.out.println("short data is: "+s3);
		
		//int 4byte 
		
		int i1=50000;
		int i2=76543899;
		//The literal 999999999999 of type int is out of range 
		//int i3=999999999999;
		
		System.out.println("integer data is: "+i1);
		System.out.println("integer data is: "+i2);
		
		//long 8byte
		long l1=999999999999L;
		System.out.println("long data is: "+l1);
		
		/*
		 * integral--->floating point
		 * float 4byte
		 * double(default) 8byte
		 */
		
		double d1=98.6787655;
		System.out.println("double data is: "+d1);
		
		float f1=67.344322F;
		System.out.println("Float data is: "+f1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
