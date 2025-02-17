package com.celcom.day10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Java Program to Convert ArrayList to LinkedList and vice versa
public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();
		System.out.println("Please Enter the size of the list");
		int size = sc.nextInt();
		while (size > 0) {
			list1.add(sc.nextInt());
			size--;
		}
		System.out.println("Elements added successfully");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

		list2.addAll(list1);
		System.out.println("After converting ArrayList into Linked List");
		for (int i : list2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("After converting Linked List into Array List");
		list1.clear();
		list1.addAll(list2);
		for (int i : list1) {
			System.out.print(i + " ");
		}
	}

}
