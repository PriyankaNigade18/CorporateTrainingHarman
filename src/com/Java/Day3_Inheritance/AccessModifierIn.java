package com.Java.Day3_Inheritance;

public class AccessModifierIn 
{

	int id=101;
	public String name="Ram";
	private long phno=87775444L;
	protected int acno=999999;
	
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		AccessModifierIn  a1=new AccessModifierIn ();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);
	}

}
