package com.celcom.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//.Write a Java program that illustrates sort.
public class Assignment5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();

		System.out.println("Please Enter the size of the Two Arrays");
		int size = sc.nextInt();

		System.out.println("Please enter the elements for list1");
		while (size > 0) {
			list.add(sc.nextInt());
			size--;
		}

		Collections.sort(list);

		for (int i : list) {
			System.out.print(i + " ");
		}

	}

}
