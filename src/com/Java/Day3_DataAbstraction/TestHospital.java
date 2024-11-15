package com.Java.Day3_DataAbstraction;

public class TestHospital {

	public static void main(String[] args) 
	{
		NobleHs n1=new NobleHs();
		n1.medical();
		n1.dental();
		n1.physio();
		n1.cardio();
		n1.nero();
		n1.covid19Test();
		
		System.out.println("*****************");

		IMA i1=new NobleHs();
		i1.dental();
		i1.physio();
		i1.covid19Test();
		
		System.out.println("*****************");
		USMA u1=new NobleHs();
		u1.cardio();
		u1.nero();
		u1.covid19Test();
		

		
	}

}
