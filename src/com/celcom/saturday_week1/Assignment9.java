package com.celcom.saturday_week1;


class Vehicle{
	
	void drive() {
		
		
	}
}

class Car extends Vehicle{
	
	void drive()
	{
		System.out.println("Repairing a Car");
	}
}
public class Assignment9 {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.drive();
	

	}

}
