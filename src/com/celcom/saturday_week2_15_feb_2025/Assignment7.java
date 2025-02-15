package com.celcom.saturday_week2_15_feb_2025;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Write a Java program to iterate through all elements
//in a linked list starting at the specified position.

public class Assignment7 {

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
			System.out.println("Please Enter the Starting Index to Traverse");
			int index = sc.nextInt();
			if(index>=size1)
			{
				System.out.println("Please enter the valid index!");
				return;
			}
			for(int i = index;i<list.size();i++) {
				System.out.print(list.get(i) + " ");
			}
	}

}
