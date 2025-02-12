package com.celcom.day7;

class MyThread1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("My Thread Running..." + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample3 {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new MyThread1());
		System.out.println(t1.getState());
		t1.setName("T1");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		

		t1.start(); // starting or running my thread t1
		
		for(int i =0;i<5;i++)
		{
			System.out.println("Hi "+ i);
		}
		Thread.sleep(200);

		System.out.println("Main End");
		t1.suspend(); // it will suspend the invoking thread t1
	}

}
