package com.celcom.day1;

import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=0)
		{
			System.out.print("1");
			return;
		}
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.print(fact);
		
	}

}
