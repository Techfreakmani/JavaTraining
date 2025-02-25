package com.celcom.restaurantorder;

public class RestaurantOrder {

	private String order;
	private boolean orderReady = false;

	// Waiter places order
		public synchronized void placeOrder(String order) {
			while (orderReady) { // Wait if previous order is not ready
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			this.order = order;
			System.out.println("Waiter: Order placed for " + order);
			orderReady = true;
			notify(); // Notify the chef
		}

	// Chef prepares order
	public synchronized void prepareOrder() {
		while (!orderReady) { // Wait if no order is placed
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Chef: Preparing " + order);
		try {
			Thread.sleep(2000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Chef: Order ready for " + order);
		orderReady = false;
		notify(); // Notify the waiter to take a new order
	}

}
