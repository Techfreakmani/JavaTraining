package com.celcom.day4;

public class MethodOverloadingExample2 {
	
	
	void addition(int a, int b) {
		int add = a + b;
		System.out.println("Addition Of Integer values :" + add);
	}
	
	void addition(double a, double b) {
		double add = a + b;
		System.out.println("Addition Of Double values:" + add);
	}
	
	void addition(long a, long b)
	{
		long add = a + b;
		System.out.println("Addition Of Long Values :" + add);
	}

	public static void main(String[] args) {
		
		MethodOverloadingExample2 obj = new MethodOverloadingExample2();
		obj.addition(10,20);
		obj.addition(10.896, 20.09768);
		obj.addition(10L, 20L);
		
	}

}
