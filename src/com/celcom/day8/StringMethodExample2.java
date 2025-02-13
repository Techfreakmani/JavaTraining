package com.celcom.day8;

//String class Method
public class StringMethodExample2 {

	public static void main(String[] args) {
		
		String s1 = "Java";
		
		for(int i = 0; i < s1.length(); i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		//Converting String to character Array
		char[] ch = s1.toCharArray();
		for(char values : ch) {
			System.out.println(values);
		}
		
		//Spliting the string
		String s2 = "Welcome to Celcom solutions";
		String[] arr = s2.split(" ");
		for(String value : arr) {
			System.out.println(value);
		}
		
	}

}
