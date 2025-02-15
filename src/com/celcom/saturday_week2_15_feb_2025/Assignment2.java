package com.celcom.saturday_week2_15_feb_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Write a Java program to sort a given array list.
public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the List");
		int size = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		while (size > 0) {
			list.add(sc.nextInt());
			size--;
		}
		System.out.println("List Before Sorting");
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("List after Sorting");
		Collections.sort(list);
		for (int i : list) {
			System.out.print(i + " ");
		}

	}

}
