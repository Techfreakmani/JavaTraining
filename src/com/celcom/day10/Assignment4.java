package com.celcom.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Write Java program that checks if two arrays contain the same elements.

public class Assignment4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		System.out.println("Please Enter the size of the Two Arrays");
		int size = sc.nextInt();
		int size1 = size;

		System.out.println("Please enter the elements for list1");
		while (size > 0) {
			list1.add(sc.nextInt());
			size--;
		}
		System.out.println("Elements added sucessfully in List1");
		System.out.println("-------------------------------------");
		System.out.println("Please enter the elements for list2");
		while (size1 > 0) {
			list2.add(sc.nextInt());
			size1--;
		}
		System.out.println("Elements added sucessfully in List2");
		System.out.println("-------------------------------------");
		Collections.sort(list1);
		Collections.sort(list2);
		for (int i = 0; i < list1.size(); i++) {
			if(list1.get(i)!=list2.get(i)) {
				System.out.println("Doesn't Contain Same Elements");
				return;
			}

		}
		System.out.println("Two Arrays contains same Elements");

	}

}
