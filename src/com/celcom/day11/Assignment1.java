package com.celcom.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1 {

	static void findSuspiciousAmount(int arr[], int amount) {
		List<Integer> list = new ArrayList<>();
		boolean flag = false;
		System.out.print("The Suspicious Transaction sequence is found : ");
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				list.add(arr[j]);
				if (sum == amount) {
					System.out.println(list);
					flag = true;
					list.clear();
					break;
				}

			}
			list.clear();
		}
		if (flag == false) {
			System.out.println("No Suspicious Transaction is Found");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		System.out.println("Enter the elements for array");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Please Enter the amount stolen");
		int stolenAmount = sc.nextInt();
		findSuspiciousAmount(arr, stolenAmount);

	}

}
