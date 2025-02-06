package com.celcom.day3;

public class ThisKeyWord {
	String name;
	
	ThisKeyWord(){
		this("Mani");
	}
	
	ThisKeyWord(String name){
		this.name = name;
		this.greeting();
	}
	
	void greeting() {
		
		System.out.println("Welcome " + name);
	}
	
	

	public static void main(String[] args) {
		ThisKeyWord obj = new ThisKeyWord();
		

	}

}
