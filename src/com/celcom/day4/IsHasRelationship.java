package com.celcom.day4;



class Vehicle{
	
	void engine() {
		
		System.out.println("All vehicle has a engine");
	}
	
	void wheels()
	{
		
		System.out.println("All vehicles has a wheels");
	}
}


class Wheels{
	
	void wheelModel() {
		
		System.out.println("Wheel Model is MRF");
	}
	
	void noOfWheels(String vehicleType) {
		
		if(vehicleType.equals("Two Wheeler")) {
			
			System.out.println("I have two Wheels");
		}
		else if(vehicleType.equals("Four Wheeler")) {
			
			System.out.println("I have Four Wheels");
		}
	}
}



class Engine{
	
	void engineModel() {
		
		System.out.println("engine Model is TwoStroke");
	}
	
	
}

class Car extends Vehicle{ // This is the IS-A Relationship
	
	Wheels wheel = new Wheels(); // car HAS-A wheel
	Engine engine = new Engine();// car HAS-A engine
	
	void engineModel()
	{
		engine.engineModel();
	}
	
	void wheelModel()
	{
		
		wheel.wheelModel();
		
	}
	
	void noOfWheels()
	{
		wheel.noOfWheels("Two Wheeler");
	}
	
	
}
public class IsHasRelationship {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.engine();
		car.engineModel();
		
		car.wheels();
		car.wheelModel();
		car.noOfWheels();
		
		

	}

}
