package com.celcom.day5;

//Abstract class
abstract class Vehicle{
	void oOfEngine()
	{
		System.out.println("I have one Engine");
	}
	
	abstract void noOfWheels();
	abstract void brandName();
	
	
}

public class AbstractClassExample1 {

	public static void main(String[] args) {
		
		Vehicle veh = new Vehicle() {
			void noOfWheels() {
				System.out.println("I have one Engine");
			}
			
			void brandName() {
				System.out.println("I have one Engine");
			}
		};
		
		veh.noOfWheels();
		
	}

}
