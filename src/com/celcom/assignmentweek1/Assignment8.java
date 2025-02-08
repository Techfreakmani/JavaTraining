package com.celcom.assignmentweek1;

class Animal{
	
	void makeSound() {
		
	}
}

class Cat extends Animal{
	
	@Override
	void makeSound() {
		
		System.out.println("The cat sounds like meow meow");
	}
}

public class Assignment8 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.makeSound();
		
		
	}

}
