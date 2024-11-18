package com.Java.Day4_Collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args)
	{

		LinkedList<Integer> ls=new LinkedList<Integer>();
		ls.add(100);
		ls.add(200);
		ls.add(150);
		ls.add(200);
		ls.add(300);
		
		System.out.println(ls);
		ls.addFirst(401);
		System.out.println(ls.getFirst());
		
		ls.addLast(500);
		System.out.println(ls.getLast());
		
		System.out.println(ls);
		
		System.out.println("Total:" +ls.size());
		
		System.out.println(ls.contains(500));//true
		System.out.println(ls.contains(666));//false
		
		
		ls.remove(3);//150
		
		System.out.println(ls);
		
		
		System.out.println("*************************");

		for(Integer i:ls)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
	}

}
