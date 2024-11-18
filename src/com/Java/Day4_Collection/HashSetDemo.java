package com.Java.Day4_Collection;

import java.util.HashSet;

public class HashSetDemo {

	/*
	 * HashSet is class implement Set interface
	 * under line data structure HashTable
	 * which maintains data as per hashing mechanism
	 * it create 16 virtual segment
	 * 
	 * node
	 * =============
	 * |Key|hashcode|value|address of next element|
	 * 
	 * 
	 */
	public static void main(String[] args) 
	{

		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(200);
		hs.add(null);
		
		System.out.println(hs);
		
		System.out.println("Total elements: "+hs.size());
		
		hs.remove(null);
		
		System.out.println(hs);
		
		System.out.println("foreach + iterator()");
		
		for(Integer i:hs)
		{
			System.out.println(i);
		}

		
		
		System.out.println(hs.contains(300));
	}

}
