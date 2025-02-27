package com.celcom.day6;

public class TryCatchExample1 {

	public static void main(String[] args) {

		System.out.println("Before Exception");

		try {
			int a = 10 / 0;
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("After Exception");

	}

}
