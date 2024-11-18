package com.Java.Day4_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	/*
	 * ArrayList is class implement List interface
	 * ArrayList is based on Dynamic array
	 * based on indexing
	 * duplicate elements allowed
	 * isEmpty(),size(),contains(),remove(index),clear()
	 * ArrayList support total 10 virtual segment
	 */
	public static void main(String[] args)
	{
		
		List<Integer> al=new ArrayList<Integer>();
		

		//ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Before inerserting elements into list status is: "+al.isEmpty());//true
		al.add(100);
		al.add(101);
		al.add(102);
		al.add(200);
		al.add(201);
		al.add(100);
		al.add(201);
		
		System.out.println("After inerserting elements into list status is: "+al.isEmpty());//false

		System.out.println(al);
		
		System.out.println("Total Elements are: "+al.size());
		
		al.remove(3);//200
		
		System.out.println(al);
		
		al.add(3,90);
		
		System.out.println(al);
		
		System.out.println("Is 500 element present?: "+al.contains(500));//false
		System.out.println("Is 201 element present?: "+al.contains(201));//true

//		al.clear();
//		
//		System.out.println(al);//[]
//		System.out.println(al.size());//0
		
		
		System.out.println("***********Iteration using simple for loop***********");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("***********Iteration using  for each loop***********");

		for(Integer i:al)
		{
			System.out.println(i);
		}
		
		System.out.println("***********Iteration using iterator()***********");

		/*
		 * Java collection framework provides Iterator interface
		 * 1.hasNext()
		 * 2.next()
		 * 
		 */
		
		Iterator<Integer> ir=al.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
