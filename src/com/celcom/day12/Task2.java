package com.celcom.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Checking <T>{
	List<T> array1 = new ArrayList<>();
	List<T> array2 = new ArrayList<>();
	
	public boolean check() {
		for(int i=0;i<array1.size();i++)
		{
			if(!(array1.get(i).equals(array2.get(i))))
			{
				return false;
			}
			
		}
		return true;
		
	}
}

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Checking<String> task = new Checking();

		System.out.println("Enter the size of the array1 and array2");
		int size = sc.nextInt();
		int size1 = size;
		sc.nextLine();

		System.out.println("Enter the data to add in array1");

		while (size > 0) {
			String name = sc.nextLine();
			task.array1.add(name);
			size--;

		}

		System.out.println("Data added successfully in array1");
		
		System.out.println("-----------------------------------");


		System.out.println("Enter the data to add in array2");

		while (size1 > 0) {
			String name = sc.nextLine();
			task.array2.add(name);
			size1--;
		}

		System.out.println("Data added successfully in list2");
		System.out.println("-----------------------------------");
		
		boolean checked = task.check();
		
		if(checked) {
			System.out.println("Both the array contains same data!");
			return;
		}
		System.out.println("Both array contains different data!");
		

	}

}
