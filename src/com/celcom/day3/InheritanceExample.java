package com.celcom.day3;

//Single Inheritance,Multilevel Inheritance

class Vehicle{
	
	void noOfEngine() {
		System.out.println("I have one engine");
	}
	
}

class TwoWheeler extends Vehicle{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}

class Bike extends TwoWheeler{
	
	void brandName() {
		System.out.println("My Brand is Yamaha");
	}
}

class FourWheeler extends Vehicle{
	void brandName() {
		System.out.println("BMW");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		
		Bike yamaha = new Bike();
		yamaha.noOfEngine();
		yamaha.noOfWheels();
		yamaha.brandName();
		
		FourWheeler car = new FourWheeler();
		
		System.out.println("-----------------");
		car.brandName();
		car.noOfEngine();
		

	}

}
