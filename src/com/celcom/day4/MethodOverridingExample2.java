package com.celcom.day4;


class Animal{
	
	void move() {
		
		System.out.println("can not define");
		
	}
	
	void eat() {
		
		System.out.println("can not define");
		
	}
}

class Cat extends Animal{

	
	void move()
	{
		
		System.out.println("Cat will move by Walk");
		
	}
	
	void eat()
	{
		
		System.out.println("Cat will eat Rat");
		
	}
	
}

class Parrot extends Animal{
	
	void move()
	{
		
		System.out.println("Parrot will move by Fly");
		
	}
	
	void eat() {
		
		System.out.println("Parrot will eat Fruits");
		
	}
}

class Fish extends Animal{
	
	void move() {
		
		System.out.println("Fish will move by Swim");
	}
	
	void eat()
	{
		
		System.out.println("Fish will eat Grains");
	}
	
}

public class MethodOverridingExample2 {

	public static void main(String[] args) {
		Animal animal;
		
		animal = new Cat();
		animal.move();
		animal.eat();
		System.out.println("---------------------");
		
		
		animal = new Parrot();
		animal.move();
		animal.eat();
		System.out.println("---------------------");
		
		
		animal = new Fish();
		animal.move();
		animal.eat();
		
		
		
		

	}

}
