package com.Java.Day1;

public class OperatorsDemo {

	public static void main(String[] args)
	{
		// Arithmetic Operators
		int a=20,b=10;
		
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Modulus is: "+(a%b));

		/*
		 * ++(increment)  --(decrement)
		 * 
		 * a++ = post increment
		 * ++a =Pre increment
		 * 
		 * a=a+1
		 * 
		 */
		int x=90;
		System.out.println(x);//90
		System.out.println(x++);//90
		System.out.println(x);//91
		
		int y=100;
		System.out.println(y);//100
		System.out.println(++y);//101
		
		int c=678;
		int d=c++;
		System.out.println(d);//678
		System.out.println(c);//679
		
		int i=48;
		int j=i++;
		System.out.println(i);//49
		System.out.println(j);//48
		
		int u=78;
		int v=++u;
		System.out.println(u);//79
		System.out.println(v);//79
		
		int p=1089;
		int q=++p;
		System.out.println(p);//1090
		System.out.println(q);//1090
		
		//a-- = a=a-1
		
		
		int c1=56;
		System.out.println(c1);//56
		System.out.println(c1--);//56
		System.out.println(c1);//55
		
		int d1=67;
		System.out.println(d1);//67
		System.out.println(--d1);//66
		
		int i1=98;
		int y1=--i1;
		System.out.println(i1);//97
		System.out.println(y1);//97
		
		int f=173;
		int g=f--;
		System.out.println(g);//173
		System.out.println(f);//172
		
		System.out.println("*********Relational Operator******************");
		
		//u=v=79 i=49 j=48 i1=y1=97 g=173
		
		System.out.println("Less than <: "+(i<u));//true
		System.out.println("less than equal to <=: "+(u<=v));//true
		
		System.out.println("greater than >: "+(g>v));//true
		System.out.println(j>u);//false
		System.out.println("greater than equal to: "+(g>=v));//true
		
		System.out.println(u==v);//true
		System.out.println(u==i);//false
		
		System.out.println(u!=g);//true
		System.out.println(u!=v);//false
		
		System.out.println("*********Logical operators****************");
		
		//AND
		System.out.println((u==v) && (u!=g));//true
		System.out.println((u==v) && (u!=v));//false
		System.out.println((i==j) && (u==v));//false
		System.out.println((i>g) && (u>g));//false
		
		//OR
		System.out.println((u==v) || (u!=g));//true
		System.out.println((u==v) || (u!=v));//true
		System.out.println((i==j) || (u==v));//true
		System.out.println((i>g)||(u>g));//false
		
		//Not(!)
		System.out.println(u==v);//true
		System.out.println(!(u==v));//false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
