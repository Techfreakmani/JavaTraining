package com.celcom.day6;

import java.util.Scanner;


class InvalidAgeException extends Exception {
	
	public String toString() {
		return "Invalid Age for Voting";
	}
}
public class UserDefinedException {

	public static void main(String[] args) {
		System.out.println("Enter your Age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("Welcome to Vote");
		} else {
			try {
				throw new InvalidAgeException();
			} catch (InvalidAgeException e) {
				System.out.println(e);
			}
		}

	}

}
