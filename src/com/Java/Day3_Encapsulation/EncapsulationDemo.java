package com.Java.Day3_Encapsulation;

import com.Java.Day1.FirstCode;

class Emp
{
	private int id=101;
	private String name="Riya";
	
	//public method 
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void display()
	{
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
	}
	
	
}







public class EncapsulationDemo {

	public static void main(String[] args)
	{
			Emp e1=new Emp();
			e1.display();
			//e1.id=102;
			
			//System.out.println(e1.id);
			e1.setId(102);
			e1.setName("Reena");
			
			e1.display();
			
			//FirstCode f1=new FirstCode();
			
			

	}

}
