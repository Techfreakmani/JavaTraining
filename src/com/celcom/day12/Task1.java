package com.celcom.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task<T> {
	List<T> list1 = new ArrayList<>();
	List<T> list2 = new ArrayList<>();

	List<T> mergedList = new ArrayList<>();

	public void merge() {
		mergedList.addAll(list1);
		mergedList.addAll(list2);
		for (T values : mergedList) {
			System.out.print(values + " ");
		}

	}

}

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Task<String> task = new Task();

		System.out.println("Enter the size of the list1");
		int size = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the name to add in list1");

		while (size > 0) {
			String name = sc.nextLine();
			task.list1.add(name);
			size--;

		}

		System.out.println("Name added successfully in list1");
		System.out.println("-----------------------------------");

		System.out.println("Enter the size of the list2");
		int size1 = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the name to add in list2");

		while (size1 > 0) {
			String name = sc.nextLine();
			task.list2.add(name);
			size1--;
		}

		System.out.println("Name added successfully in list2");
		System.out.println("-----------------------------------");

		System.out.println("The merged List is : ");

		task.merge();

	}

}
