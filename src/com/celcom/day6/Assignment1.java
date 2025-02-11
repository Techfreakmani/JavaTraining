package com.celcom.day6;

import java.util.Scanner;

class DuplicateException extends Exception {
	public String toString() {
		return "Element already exist";
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the array");
		int length = sc.nextInt();
		int arr[] = new int[length];
		try {
			for (int index = 0; index < arr.length; index++) {
				int input = sc.nextInt();
				for (int j = 0; j < index; j++) {
					if (arr[j] == input) {
						throw new DuplicateException();
					}
				}
						
				arr[index] = input;
			}
		} catch (DuplicateException e) {
			System.out.println(e);
		}
	}

}
