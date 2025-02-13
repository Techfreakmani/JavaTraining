package com.celcom.day8;

//Three Ways to create String Objects in Java
public class StringExample1 {

	public static void main(String[] args) {
		String s1 = "Hello";
		
		String s2 = new String("Java");
		
		char[] ch = {'H', 'I'};
		String s3 = new String(ch);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
