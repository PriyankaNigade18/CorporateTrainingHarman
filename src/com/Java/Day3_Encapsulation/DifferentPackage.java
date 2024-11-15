package com.Java.Day3_Encapsulation;

import com.Java.Day3_Inheritance.AccessModifierIn;

public class DifferentPackage extends AccessModifierIn{

	public static void main(String[] args) 
	{
		AccessModifierIn a1=new AccessModifierIn ();
		System.out.println(a1.name);
		
		//protected-> Only through subclass you can call
		DifferentPackage d1=new DifferentPackage();
		System.out.println(d1.acno);
		

	}

}
