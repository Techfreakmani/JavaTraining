package com.celcom.day4;

import java.util.Scanner;



public class PronicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		if(isPronic(number)) {
			System.out.print("It is a Pronic Number");
			return;
		}
		System.out.println("Not a Pronic Number");
	}
		static boolean isPronic(int number){
		for(int index = 1;index <= number; index++)
		{
			if(index * (index +1 ) == number)
			{
				return true;
			}
				
		}
		return false;
		
			
		}

	}

