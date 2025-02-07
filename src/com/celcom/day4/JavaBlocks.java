package com.celcom.day4;

public class JavaBlocks {
	
	
	{
		
		System.out.println("Instance Block");
	}
	
	JavaBlocks()
	{
		
		System.out.println("Constuctor");
	}
	
	static {
		
		System.out.println("Static Block");
	}

	public static void main(String[] args) {
		
		System.out.println("Main Method Block");
		
		JavaBlocks obj = new JavaBlocks();
		
		

	}

}
