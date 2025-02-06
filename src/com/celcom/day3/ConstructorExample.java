package com.celcom.day3;

public class ConstructorExample
{
	
	ConstructorExample(){
		this("Mani");
		System.out.println("A");
		
	}
	
	ConstructorExample(String name)
	{
		this(100);
		System.out.println("B");
	}
	
	ConstructorExample(int a)
	{
		System.out.println("C");
	}

	public static void main(String[] args) {
		ConstructorExample obj = new ConstructorExample();
		

	}

}
