package com.celcom.day4;

public class MethodOverloadingExample1 {
	//Method Overloading
	
	void fact(int a) {
		
		int fact = 1;
		for(int index = 1;index <= a ;index++)
		{
			
			fact = fact * index;
		}
		System.out.println("Factorial is :" + fact);
	}
	
	void fact(int a, int b) {
		
		int ans = a + b;
		System.out.println("Addition Of Given Number is " + ans);
	}
	
	void fact(String name) {
		System.out.println("Welcome to Celcom Solutions " + name);
	}

	public static void main(String[] args) {
		
		MethodOverloadingExample1 obj = new MethodOverloadingExample1();
		obj.fact(10);
		obj.fact("Manikandan");
		obj.fact(10,50);
		
	}

}
