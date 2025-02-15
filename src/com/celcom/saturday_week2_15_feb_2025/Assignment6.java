package com.celcom.saturday_week2_15_feb_2025;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Write a Java program to iterate through all elements in a linked list
public class Assignment6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the LinkedList");
		int size = sc.nextInt();
		List<Integer> list = new LinkedList<>();
		while (size > 0) {
			list.add(sc.nextInt());
			size--;
		}
		
		System.out.println("Traverse using for-each loop");
		for(int i : list) {
			System.out.print(i + " ");
		}
		System.out.println("\nTraverse using for loop");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println("\nTraverse using Iterator");
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		

	}

}