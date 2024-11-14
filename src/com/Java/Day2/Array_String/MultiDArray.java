package com.Java.Day2.Array_String;

public class MultiDArray {

	public static void main(String[] args) {

		//using new keyword
		int sid[][]=new int[2][3];
		sid[0][0]=10;
		sid[0][1]=20;
		sid[0][2]=30;
		
		sid[1][0]=40;
		sid[1][1]=50;
		sid[1][2]=60;
		
		System.out.println("Number if rows: "+sid.length);//2

		System.out.println("Number of cells: "+sid[0].length);//3
		
		System.out.println(sid[1][2]);//60
		//System.out.println(sid[0][3]);//Exception
		
		for(int r=0;r<sid.length;r++)
		{
			for(int c=0;c<sid[r].length;c++)
			{
				System.out.print(sid[r][c]+" ");
			}
			System.out.println();//next line for next row
		}
		
		
		System.out.println("*****Iteration using for each loop*******");
		
			
		for(int i[]: sid)//row wise data it will pass
		{
			for(int j: i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		

		System.out.println("*********************************");
		//using literal
		
		String data[][]= {{"Name","Location"},{"Sarang","Pune"},{"Nidhi","Delhi"},{"Kiran","Mumbai"}};
		
		System.out.println(data[2][1]);
		
		System.out.println("Number of rows: "+data.length);//4

		
		System.out.println("Number of columns: "+data[0].length);//2
		
		
		for(int i=0;i<data.length;i++)
		{
			
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("*****Iteration using for each loop*******");
		
		for(String i[]:data)
		{
			for(String j:i)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
			
		}
		
		
		
		
	}

}
