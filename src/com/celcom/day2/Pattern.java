package com.celcom.day2;

public class Pattern {
	public static void main(String[] args) {
		String s = "*";
		for(int i=0;i<5;i++)
		{
			System.out.println(s);
			s= s + " *";
		}
	}
}
