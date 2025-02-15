package com.celcom.saturday_week2_15_feb_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Write a Java program to reverse elements in an array list.

public class Assignment4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the size of the List");
		int size = sc.nextInt();
		while (size > 0) {
			list.add(sc.nextInt());
			size--;
		}
		System.out.println("Element Before Sorting");
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		Collections.reverse(list);
		System.out.println("Element after sorting in Reverse Order");
		for (int i : list) {
			System.out.print(i + " ");
		}

	}

}
