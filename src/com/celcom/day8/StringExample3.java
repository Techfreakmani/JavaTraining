package com.celcom.day8;

// == vs equals

public class StringExample3 {

	public static void main(String[] args) {

		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1.equals(s2)); // True
		System.out.println(s1 == s2); // False

		String s3 = "Java";
		String s4 = "Java";
		System.out.println(s3.equals(s4)); // True
		System.out.println(s3 == s4); // True

	}

}
