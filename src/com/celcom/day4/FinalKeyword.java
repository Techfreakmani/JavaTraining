package com.celcom.day4;


final class Animal{
	
	String msg = getMessage();
	
	final String getMessage() {
		return "A";
	}
}

// Animal class is final so it cannot be inherited
class Cat extends Animal{
	
	String getMessage() {
		return "B";
	}
	
}
public class FinalKeyword {

	public static void main(String[] args) {
		
		Animal animal = new Cat();
		System.out.println(animal.msg);

	}

}
