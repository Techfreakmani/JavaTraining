package com.celcom.saturday_week2_15_feb_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a Java program to search for an element in an array list.
public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the size of the List");
		int size = sc.nextInt();
		while (size > 0) {
			list.add(sc.nextInt());
			size--;
		}
		System.out.println("Please Enter the element to search");
		int element = sc.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == element) {
				System.out.println("Element Found :)");
				return;
			}
		}
		System.out.println("Element Not Found!");

	}

}
