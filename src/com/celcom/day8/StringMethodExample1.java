package com.celcom.day8;

public class StringMethodExample1 {

	public static void main(String[] args) {
		String s1 = "Java";

		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());

		System.out.println(s1.concat("Programmer")); // Java Programmer
		System.out.println(s1.replace('a', 'z')); // Java -> Jzvz

		System.out.println(s1.equals("java")); // false because java is case sensitive
		System.out.println(s1.equalsIgnoreCase("java")); // True

		System.out.println(s1.contains("av")); // true

		System.out.println(s1.startsWith("Ja")); // true
		System.out.println(s1.endsWith("va")); // true

		String s2 = "Java World";
		System.out.println(s2.substring(2, 7)); // va Wo
		System.out.println(s2.substring(2));

	}

}
