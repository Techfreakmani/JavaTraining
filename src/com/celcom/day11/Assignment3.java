package com.celcom.day11;

import java.util.Scanner;

public class Assignment3 {

	public static void numDecodings(String input) {
		if ((input.charAt(0) == '0') || input.length() == 0) {
			System.out.println("0");
			return;
		}

		int[] arr = new int[input.length() + 1];
		arr[0] = 1;
		arr[1] = 1;

		for (int i = 2; i <= input.length(); i++) {
			int num1 = Integer.parseInt(input.substring(i - 1, i));
			int num2 = Integer.parseInt(input.substring(i - 2, i));

			if (num1 >= 1 && num1 <= 9) {
				arr[i] += arr[i - 1];
			}
			if (num2 >= 10 && num2 <= 26) {
				arr[i] += arr[i - 2];
			}
		}
		System.out.println("The Decoding ways are :" + arr[input.length()]);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the input");
		String input = sc.nextLine();
		numDecodings(input);

	}

}
