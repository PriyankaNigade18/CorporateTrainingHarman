package com.Java.Day4_Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	/*
	 * HashMap is class implements Map interface
	 * HashMap is based on HashTable
	 * 
	 */
	public static void main(String[] args) 
	{
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("Kharadi",411046);
		map.put("VimanNagar",411047);
		map.put("Wadgaosheri", 411014);
		map.put("Lohegaon", 411047);
		map.put(null,411088);
		
		
		System.out.println(map);
		
		
		map.remove(null);
		
		System.out.println(map);
		
		System.out.println(map.containsKey("Swarget"));//false
		System.out.println(map.containsValue(411047));//true
		
		System.out.println("get the value: "+map.get("Kharadi"));
		
		
		System.out.println("************for each loop**************");
		
		/*
		 * Entry is interface in Map interface
		 */
		
		for(Map.Entry<String,Integer> i: map.entrySet())
		{
			//System.out.println(i.getKey()+":"+i.getValue());
			
			//System.out.println(i.getValue());
			
			System.out.println(i.getKey());
		}
		
		
		
		System.out.println(map.get("VimanNagar"));
		
		
		
		
		
	

	}

}
