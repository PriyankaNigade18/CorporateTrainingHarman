package com.Java.Day3_Inheritance;

public class ChildB extends ParentA
{
	@Override
	public void color()
	{
		System.out.println("Yellow");
	}


	public static void main(String[] args) {

		//child class ref & child class Object
		ChildB b1=new ChildB();
		b1.color();//yellow
		
		//parent class ref and parent class object
		ParentA p1=new ParentA();
		p1.color();//Red
		
		
		//Parent class refa and child class object
		ParentA p2=new ChildB();
		p2.color();//Yellow

	}

}
