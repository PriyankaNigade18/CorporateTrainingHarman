package com.Java.Day1;

public class AccessModifier {

	int id=101;//default
	public String name="Pooja";
	private long phno=976654448L;
	
	public static void main(String[] args)
	{
		AccessModifier a1=new AccessModifier();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);

	}

}
