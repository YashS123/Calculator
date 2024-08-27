package com.compute;

public class Calculator {
	public static int add(int a,int b)
	{
		return(a+b);
	}
	public static int diff(int a,int b)
	{
		return(a-b);
	}
	public static int multiply(int a,int b)
	{
		return(a*b);
	}
	public static int divide(int a,int b)
	{
		return(a/b);
	}
	
	public static void main(String[] args) {
		System.out.println(Calculator.add(3, 5));
	}


}
