package com.celcom.day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task2 {

	public static void main(String[] args) {

		ExecutorService obj = Executors.newFixedThreadPool(6);
		for (int i = 1; i <= 10; i++) {
			obj.execute(() -> {
				System.out.println("Task is running" + Thread.currentThread());
				try {
					Thread.currentThread().sleep(2000);
					System.out.println("Task is completed" + Thread.currentThread());
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			});
		}

	}

}
