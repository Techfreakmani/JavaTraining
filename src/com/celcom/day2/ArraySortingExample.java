package com.celcom.day2;

import java.util.Arrays;

public class ArraySortingExample {

	public static void main(String[] args) {
		
		//Before Sorting
		System.out.println("Before Sorting");
		
		int arr[] = {5, 20, 13, 48, 25, 96};
		
		for(int value : arr)
		{
			System.out.print(value + " ");
		}
		
		Arrays.sort(arr);
		
		//After Sorting in Ascending Order
		System.out.println("\nAfter Sorting");
		
		for(int value : arr)
		{
			System.out.print(value + " ");
		}
		
		System.out.println("Minimum Value :" + arr[0]);
		System.out.println("Second Minimum Value :" + arr[1]);
		
		System.out.println("Maximum Value :" + arr[arr.length - 1]);
		System.out.println("Second Maximum Value :" + arr[arr.length - 2]);
		
		//Descending Order
		System.out.println("Sorted in Descending Order");
		for(int index=arr.length -1 ;index>=0;index--)
		{
			System.out.print(arr[index]+" ");
		}
		
		
		
		

	}

}
