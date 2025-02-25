package com.celcom.restaurantorder;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		RestaurantOrder restaurantOrder = new RestaurantOrder();
		Waiter waiter = new Waiter(restaurantOrder, sc);
		Chef chef = new Chef(restaurantOrder);

		waiter.start();
		chef.start();

	}

}
