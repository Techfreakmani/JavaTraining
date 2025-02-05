package com.celcom.day2;

public class TypesOfVariable {
	int b = 20; // instance or object variable
	static int c = 30; // static or class variable
	
	public static void main(String[] args) {
		int a = 10;//Local variable
		System.out.println(a);
		
		TypesOfVariable t = new TypesOfVariable();
		System.out.println(t.b);
		System.out.println(c);
	}

}
