package com.celcom.saturday_week2_15_feb_2025;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Write a Java program to copy a linked list to another linked list.

public class Assignment10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list1 = new LinkedList<>();
		List<Integer> list2 = new LinkedList<>();
		System.out.println("Enter the size of the List");
		int size = sc.nextInt();
		while (size > 0) {
			list1.add(sc.nextInt());
			size--;
		}
		System.out.println("Element in List 1");
		
		for(int i : list1)
		{
			System.out.print(i + " ");
			list2.add(i);
		}
		System.out.println("\nElement in List 2");
		
		for(int i : list2) {
			System.out.print(i + " ");
		}

	}

}
