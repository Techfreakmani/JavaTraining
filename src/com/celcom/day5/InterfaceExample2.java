package com.celcom.day5;


interface Animal{
	
	void move();
	
	void eat();
}

class Cat implements Animal{

	
	public void move()
	{
		
		System.out.println("Cat will move by Walk");
		
	}
	
	public void eat()
	{
		
		System.out.println("Cat will eat Rat");
		
	}
	
}

class Parrot implements Animal{
	
	public void move()
	{
		
		System.out.println("Parrot will move by Fly");
		
	}
	
	public void eat() {
		
		System.out.println("Parrot will eat Fruits");
		
	}
}

class Fish implements Animal{
	
	public void move() {
		
		System.out.println("Fish will move by Swim");
	}
	
	public void eat()
	{
		
		System.out.println("Fish will eat Grains");
	}
	
}

public class InterfaceExample2  {

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
