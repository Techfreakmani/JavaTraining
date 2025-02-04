package com.celcom.day1;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1;
		int num2;
		int choice;
		do {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
		
			System.out.println("Enter your choice : 1.Addition 2.Division 3.Multiplication 4.division 5.Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Addition : " + (num1 + num2));
				break;
			case 2:
				System.out.print("Subtraction : " + (num1 - num2));
				break;
			case 3:
				System.out.print("Multiplication : " + (num1 * num2));
				break;
			case 4:
				System.out.print("Division : " + (num1 / num2));
				break;
			}
			}while(choice<5);
		
		

	}

}
