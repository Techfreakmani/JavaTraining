package com.celcom.day7;


class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("My Thread Running..." + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample4 {
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new MyThread2());
		t1.setName("T1");
		
		Thread t2 = new Thread(new MyThread2());
		t1.setName("T2");
		
		t1.start();
		t2.start();
		
	}

}
