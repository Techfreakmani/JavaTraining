package com.celcom.restaurantorder;

public class Chef extends Thread{
	private RestaurantOrder order;

	public Chef(RestaurantOrder order) {
		this.order = order;
	}

	public void run() {
		while (true) {
			order.prepareOrder();
		}
	}

}
