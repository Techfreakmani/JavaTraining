package com.celcom.day8;

//String are immutable objects like array
//StringBuffer is mutable objects
public class StringExample2 {

	public static void main(String[] args) {

		String s1 = "Mani";
		s1.concat("Kandan");
		System.out.println(s1); // Mani

		String s2 = "Celcom";
		StringBuffer sb = new StringBuffer(s2);
		sb.append("Solutions");
		System.out.println(sb); // CelcomSolutions
		
		String s3 = "Java";
		StringBuilder sb1 = new StringBuilder(s3);
		sb1.append("Programming");
		System.out.println(sb1); // JavaProgramming
		

	}

}
