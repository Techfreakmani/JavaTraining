package com.celcom.day4;

public class ConstructorOverloading {
	
	
	ConstructorOverloading(int number1, int number2)
	
	{
		this("Mani","kandan");
		System.out.println("Concatenation of integer values :" + number1 + number2);
		
	}
	
	ConstructorOverloading(String FirstName, String LastName)
	{
		this(10.98, 20.97);
		String concatenation = FirstName + LastName ;
		System.out.println("Concatenation of String values :" + concatenation);
		
	}
	
	ConstructorOverloading(double number1, double number2)
	{
		System.out.println("Concatenation of double values :" + number1 + number2);
		
	}
	
	
	

	public static void main(String[] args) {
		
		ConstructorOverloading obj = new ConstructorOverloading(10,20);
		//ConstructorOverloading obj1 = new ConstructorOverloading("Mani","kandan");
		//ConstructorOverloading obj2 = new ConstructorOverloading(10.08,20.98);
		
		
		

	}

}
