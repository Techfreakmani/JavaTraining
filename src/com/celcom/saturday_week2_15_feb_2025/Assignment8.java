package com.celcom.saturday_week2_15_feb_2025;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Write a Java program to iterate a linked list in reverse order.
public class Assignment8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the LinkedList");
		int size = sc.nextInt();
		int size1 = size;
		List<Integer> list = new LinkedList<>();
		while (size > 0) {
			list.add(sc.nextInt());
			size--;
		}
		System.out.println("Iteration in reverse order");
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
	}

}
