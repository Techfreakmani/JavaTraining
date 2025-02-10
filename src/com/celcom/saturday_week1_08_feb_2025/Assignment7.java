package com.celcom.saturday_week1_08_feb_2025;


import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
class Account{
	
	int accountNumber;
	String accountHolderName;
	String branchName;
	long phoneNumber;
	double balance;
	
	Account(int accountNumber, String accountHolderName, String branchName,long phoneNumber){
		
		this.accountNumber= accountNumber;
		this.accountHolderName = accountHolderName;
		this.branchName = branchName;
		this.phoneNumber = phoneNumber;
	}
	
	//To deposit amount
	void deposit(int amount) {
		
		balance += amount;
	}
	
	//To withdraw amount
	void withDraw(int amount)
	{
		balance -= amount;
	}
	
}


class Bank{
	
	private Map<Integer,Account> bank = new HashMap<>();
	
	Scanner sc = new Scanner(System.in);
	
	
	Account account = new Account(sc.nextInt(), sc.next(), sc.next(), sc.nextLong());
	
	
	void deposit(int amount)
	{
		
		account.deposit(amount);
		System.out.println("Amount was successfully credited");
	}
	
	void withDraw(int amount) {
		
		account.withDraw(amount);
		System.out.println("Amount Debited successfully");
	}
	
	void setData() {
		
		if(bank.containsKey(account.accountNumber))
		{
			
			System.out.println("Account Already Exist");
		}
		else {
			
			bank.put(account.accountNumber, account);
		}
		
		System.out.println("--------------------");
	}
	
	
	//To get Current account details
	void getCurrentAccountDetails() {
		
		System.out.println("Account Holder Name :" + bank.get(account.accountNumber).accountHolderName);
		System.out.println("Account Number :" + bank.get(account.accountNumber).accountNumber);
		System.out.println("Branch Name :" + bank.get(account.accountNumber).branchName);
		System.out.println("Account Balance :" + bank.get(account.accountNumber).balance);
		System.out.println("Customer Phone Number :" + bank.get(account.accountNumber).phoneNumber );
		System.out.println("-----------------------");
		
	}
	
	//To get All acount details
	void getAllAccountDetails() {
		
		for(Account allDetails : bank.values()) {
			
			System.out.println("Account HolderName :" + allDetails.accountHolderName);
			System.out.println("Account Number :" + allDetails.accountNumber);
			System.out.println("Branch Name :" + allDetails.branchName);
			System.out.println("Customer Phone Number :" + allDetails.phoneNumber);
			System.out.println("Account Balance :" + allDetails.balance);
			System.out.println("------------------------");
			
			
		}
	}
	
	
	
	
	
}

public class Assignment7 {

	public static void main(String[] args) {
		System.out.println("Enter account number ,  AccountNoldername branchName and PhoneNumber ");
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		
		while(true) {
			
			System.out.println("Please enter your choice");
			System.out.println(" 1.Deposit\n 2.Withdraw\n 3.Get All Account Details\n 4.Get Your AccountDetails\n 5.Exit");
			int choice = sc.nextInt();
			bank.setData();
			
			switch(choice) {
			
			case 1:
				
				System.out.println("Please Enter your Amount for Deposit");
				bank.deposit(sc.nextInt());
				break;
				
			case 2:
				System.out.println("Please Enter Amount for Withdrawal");
				bank.withDraw(sc.nextInt());
				break;
				
			case 3:
				System.out.println("Get All Account Details");
				bank.getAllAccountDetails();
				break;
				
			case 4:
				bank.getCurrentAccountDetails();
				break;
			case 5:
				return;
			default:
				System.out.println("Please Enter a Valid Choice");
				
			}
			
			
		}

	}

}
