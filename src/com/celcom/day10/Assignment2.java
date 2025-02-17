package com.celcom.day10;

// Write a Java program to create a producer-consumer 
//scenario using the wait() and notify() methods for thread synchronization.

class Product {
	private String Pname;

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		this.Pname = pname;
	}

}

class Consumer extends Thread {
	Product prod;

	public Consumer(Product prod) {
		this.prod = prod;
	}

	@Override
	public void run() {
		synchronized (prod) {
			System.out.println("Consumer is waiting for producer to produce");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				prod.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The name the product is :" + prod.getPname());
		}
	}

}

class Producer extends Thread {
	Product prod;

	public Producer(Product prod) {
		this.prod = prod;
	}

	@Override
	public void run() {
		synchronized (prod) {
			System.out.println("Producer is producing Please Wait.....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			prod.setPname("Dell Laptop");
			prod.notify();

		}
	}

}

public class Assignment2 {

	public static void main(String[] args) {
		Product prod = new Product();

		Consumer consumer = new Consumer(prod);
		consumer.start();

		Producer producer = new Producer(prod);
		producer.start();

	}

}
