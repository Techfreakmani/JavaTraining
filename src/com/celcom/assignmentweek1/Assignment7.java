package com.celcom.assignmentweek1;


import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
class Account{
	
	String accountHolderName;
	String branchName;
	long phoneNumber;
	double balance;
	
	Account(String accountHolderName, String branchName,long PhoneNumber){
		
		this.accountHolderName = accountHolderName;
		this.branchName = branchName;
		this.phoneNumber = phoneNumber;
	}
}


class Bank{
	
	private Map<Long,Account> bank = new HashMap<>();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your Name");
	String name = sc.next();
	
	System.out.println("Enter your BranchName");
	String branch = sc.next();
	
	System.out.println("Enter your Phone Number");
	long phone = sc.nextLong();
	
	
	Account account = new Account(name, branch, phone);
	
	
	
	
}

public class Assignment7 {

	public static void main(String[] args) {
		

	}

}
