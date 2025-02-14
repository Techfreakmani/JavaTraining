package com.celcom.day9;

public class WrapperClassExample {

	public static void main(String[] args) {

		int a = 10;
		Integer obj = new Integer(a); // Boxing
		int b = obj.intValue(); // Un-Boxing

		// JDK 1.5
		Integer obj1 = a;// Auto Boxing
		Integer c = obj; // Auto Un-Boxing

	}

}
