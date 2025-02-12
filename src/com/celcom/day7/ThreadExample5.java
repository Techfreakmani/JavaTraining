package com.celcom.day7;

class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=10; i++)
		{
			System.out.println(" 2 * " + i + " = " + (i*2));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class Thread2 implements Runnable{
	@Override
	public synchronized void run() {
		for(int i=1; i<=10; i++)
		{
			System.out.println(" 5 * " + i + " = " + (i*5));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class ThreadExample5 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread1 t1 = new Thread1();
		Thread t2 = new Thread(new Thread2());
		
		Thread t3 = new Thread(new Thread2());
		
		t1.start();
		
		t1.join();
		
		System.out.println("Main");
		t2.start();
	}

}
