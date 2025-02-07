package com.celcom.day4;

public class MethodOverloadingExample3 {
	
	
	void concat(int number1, int number2)
	{
		System.out.println("Concatenation of integer values :" + number1 + number2);
		
	}
	
	void concat(String FirstName, String LastName)
	{
		String concatenation = FirstName + LastName ;
		System.out.println("Concatenation of String values :" + concatenation);
		
	}
	
	void concat(double number1, double number2)
	{
		System.out.println("Concatenation of double values :" + number1 + number2);
		
	}
	
	
	

	public static void main(String[] args) {
		
		MethodOverloadingExample3 obj = new MethodOverloadingExample3();
		obj.concat(10, 20);
		obj.concat("Mani", "kandan");
		obj.concat(10.99, 36.097);
		

	}

}
