package com.celcom.saturday_week2_15_feb_2025;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Write a Java program to display elements and their positions in a linked list
public class Assignment9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new LinkedList<>();
		System.out.println("Enter the size of List");
		int size = sc.nextInt();
		while (size > 0) {
			list.add(sc.nextInt());
			size--;
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println("The position of element " + list.get(i) + " is " + i);
		}

	}

}
