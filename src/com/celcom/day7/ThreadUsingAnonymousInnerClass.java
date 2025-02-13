package com.celcom.day7;

public class ThreadUsingAnonymousInnerClass {

	public static void main(String[] args) {

		// Implementing run method in runnable interface
		// Thread creation using anonymous inner class
		Runnable runnable = new Runnable() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(" 2 * " + i + " = " + (i*2));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		Thread t1 = new Thread(runnable);
		t1.start();

		// thread creation using lambda expression
		Runnable runnable1 = () ->{
			for(int i=1; i<=10; i++)
			{
				System.out.println(" 5 * " + i + " = " + (i*5));
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
			}
		};
		
		Thread t2 = new Thread(runnable1);
		t2.start();
		

	}

}
