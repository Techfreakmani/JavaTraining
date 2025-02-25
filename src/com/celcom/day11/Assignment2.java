package com.celcom.day11;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the number of items: ");
			int noOfItems = sc.nextInt();

			if (noOfItems >= 4 || noOfItems < 0) {
				System.out.println("Please Enter the valid Number");
				return;
			}

			System.out.println("Enter the heating time for one item (in seconds):");
			float seconds = sc.nextFloat();
			sc.nextLine();

			System.out.println("Enter the type of food (e.g., pasta, frozen meal, vegetables):");
			String name = sc.nextLine();

			if (!(name.equalsIgnoreCase("pasta")) && !(name.equalsIgnoreCase("vegetables"))
					&& !(name.equalsIgnoreCase("frozen meal"))) {
				System.out.println("Please Enter the valid Food Name");
				return;
			}

			System.out.println("Enter the microwave model (high, medium, low):");
			String model = sc.nextLine();

			if (!(model.equalsIgnoreCase("High")) && !(model.equalsIgnoreCase("Low"))
					&& !(model.equalsIgnoreCase("Medium"))) {
				System.out.println("Please Enter the valid model Name");
				return;
			}

			float calcTime = seconds;
			if (noOfItems == 2) {
				calcTime += (calcTime * 0.5);
			} else if (noOfItems == 3) {
				calcTime += calcTime;

			}

			if (name.equalsIgnoreCase("pasta")) {
				calcTime += (calcTime * 0.10);
			} else if (name.equalsIgnoreCase("Frozen meal")) {
				calcTime += (calcTime * 0.20);
			}

			if (model.equalsIgnoreCase("Medium")) {
				calcTime -= (calcTime * 0.10);
			} else if (model.equalsIgnoreCase("Low")) {
				calcTime += (calcTime * 0.15);
			}

			System.out.println("The Recommended Heating Time is :" + calcTime);

		}

	}

}
