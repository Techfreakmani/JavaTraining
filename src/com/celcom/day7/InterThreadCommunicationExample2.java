package com.celcom.day7;
import java.util.Scanner;

class SavingsAccount{
	private long balanceAmount;
	
	public long getBalanceAmount() {
		return balanceAmount;
	}

	void deposit(long amount) {
		this.balanceAmount = this.balanceAmount + amount;
		}
	
	void withdraw(long amount) {
		this.balanceAmount = this.balanceAmount - amount;
	}
}

class WithDrawer extends Thread{
	SavingsAccount savingsAccount;

	public WithDrawer(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}
	
	
	@Override
	public void run() {
		synchronized(savingsAccount) {
			System.out.println("Withdrawer is waiting for Depositor to deposit a money....");
			try {
				savingsAccount.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Enter the amount to withdraw");
			long amount = new Scanner(System.in).nextLong();
			savingsAccount.withdraw(amount);
			System.out.println(amount + " Withdraw Successfully");
			System.out.println("Balance :" + savingsAccount.getBalanceAmount());
		}
	}
	
}

class Depositor implements Runnable{
	
	SavingsAccount savingsAccount;

	public Depositor(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}
	
	@Override
	public void run() {
		synchronized (savingsAccount) {
			System.out.println("Enter the money to deposit");
			long amount = new Scanner(System.in).nextLong();
			savingsAccount.deposit(amount);
			System.out.println(amount + " Amount Deposited Successfully");
			System.out.println("Balance :" + savingsAccount.getBalanceAmount());
			savingsAccount.notify();
			
		}
		
	}
	
	
}
public class InterThreadCommunicationExample2 {

	public static void main(String[] args) throws InterruptedException {
		
		SavingsAccount savingsAccount = new SavingsAccount();
		
		WithDrawer withdraw = new WithDrawer(savingsAccount);
		withdraw.start();
		
		Thread.sleep(2000);
		
		Thread depositor = new Thread(new Depositor(savingsAccount));
		depositor.start();
		
	}

}
