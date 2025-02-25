package com.celcom.restaurantorder;

import java.util.Scanner;

public class Waiter extends Thread{
	private RestaurantOrder order;
	private Scanner sc;

	public Waiter(RestaurantOrder order, Scanner sc) {
		this.order = order;
		this.sc = sc;
	}

	public void run() {
		while (true) {
			System.out.print("Enter food item to order (or type 'exit' to stop): ");
			String food = sc.nextLine();
			if (food.equalsIgnoreCase("exit")) {
				System.out.println("Waiter: No more orders. ThankYou Please Visit Again");
				System.exit(0);
			}
			order.placeOrder(food);
			try {
				Thread.sleep(500); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
