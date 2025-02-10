package com.celcom.day5;


interface VehiclePlan1{
	
	void noOfEngine();
	
}

interface VehiclePlan2{
	
	void noOfWheels();
	void brandName();
	
	
}
class Car1 implements VehiclePlan1,VehiclePlan2{
	
	public void noOfEngine()
	{
		System.out.println("I have one engine");
	}
	
	public void noOfWheels()
	{
		System.out.println("I have Four wheels");
	}
	
	public void brandName() {
		System.out.println("Porsche");
	}
}

public class InterfaceExample1 {

	public static void main(String[] args) {
		Car1 car = new Car1();
		car.noOfEngine();
		car.noOfWheels();
		car.brandName();
		
		
		
	}

}
