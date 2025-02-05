package com.celcom.day2;

import java.util.Scanner;
public class ArrayExample1 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int sum = 0;
		int EvenCount = 0, OddCount = 0;
		System.out.println("Initial values of an Array");
		for(int index = 0; index < arr.length; index++) {
			System.out.println(arr[index]);
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 values");
		
		for(int index = 0; index < arr.length; index++)
		{
			arr[index] = sc.nextInt();
		}
		
		for(int value:arr) {
			sum += value;
			if(value % 2 == 0)
			{
				EvenCount++;
			}
			else {
				OddCount++;
			}
		}
		System.out.println("Sum of Array Elements : " + sum);
		System.out.println("EvenCount of Array Elements : " + EvenCount);
		System.out.println("OddCount of Array Elements : " + OddCount);
		

	}

}
