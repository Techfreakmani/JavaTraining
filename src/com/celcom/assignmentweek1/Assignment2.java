package com.celcom.assignmentweek1;


class Dog{
	
	String name;
	String breed;
	
	Dog(String name, String breed){
		
		this.name = name;
		this.breed = breed;
	}
	
	void display() {
		
		System.out.println("Name of the Dog is :" + name);
		System.out.println("Breed of the Dog is :"+ breed);
	}
	
	
}

public class Assignment2 {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Jack", "Rottweiler");
		dog.display();
		
		System.out.println("---------------------");
		
		Dog dog1 = new Dog("Tom", "Pomeranian");
		dog.display();
	}

}
