package com.celcom.day6;

public class FinallyExample {

	public static void main(String[] args) {

		System.out.println("Before Exception");

		try {
			int a = 10 / 0;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Inside Finally");
		}

		System.out.println("After Exception");

	}
}
