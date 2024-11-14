package com.Java.Day2.Array_String;

public class SingleDArray {

	/*
	 * Array is collection of similar type data
	 */
	public static void main(String[] args) 
	{
		//using new keyword
		
		int sid[]=new int[5];
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		sid[3]=104;
		sid[4]=105;
		
		System.out.println("size of this array is: "+sid.length);
		System.out.println(sid[2]);//103
		//System.out.println(sid[5]);//ArrayIndexOutOfBoundsException
		
		System.out.println(sid[4]);//105
		
		System.out.println("Iteration using for loop");
		for(int i=0;i<sid.length;i++)
		{
			System.out.println(sid[i]);
		}
		
		System.out.println("****Iteration using forEach loop*****");
		
		for(int i: sid)
		{
			System.out.println(i);
		}
		
		
		System.out.println("**************************************");
	
		//using literal
		
		String loc[]= {"Pune","Mumbai","Delhi"};
		
		System.out.println("Total Locations are: "+loc.length);
		
		System.out.println(loc[1]);//Mumbai
		
		System.out.println("Iteration using for loop");
		for(int i=0;i<loc.length;i++)
		{
			System.out.println(loc[i]);
		}
		
		System.out.println("****Iteration using forEach loop*****");
		
		for(String i:loc)
		{
			System.out.println(i);
		}
		
		
		
		
		System.out.println("**************************************");
		
		double marks[]= {89.56,66.45,57.88,88.56};
		
		System.out.println("Total Marks are: "+marks.length);
		
		System.out.println(marks[0]+marks[1]);
		System.out.println("Iteration using for loop");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		System.out.println("****Iteration using forEach loop*****");
		
		for(double i:marks)
		{
			System.out.println(i);
		}
		
		
		
		System.out.println("**************************************");

		Object empdata[]= {"Sarang","Pune",30,'M',98765544L};	
		System.out.println(empdata[3]);//M
		System.out.println(empdata.length);
		
		System.out.println("Iteration using for loop");
		
		for(int i=0;i<empdata.length;i++)
		{
			System.out.println(empdata[i]);
		}
		
		System.out.println("****Iteration using forEach loop*****");
		
		for(Object i: empdata)
		{
			System.out.println(i);
			if(i.equals("Pune"))
			{
				System.out.println("Match found!..Test pass!");
				break;
			}
		}
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
