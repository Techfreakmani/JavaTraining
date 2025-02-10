package com.celcom.saturday_week1;



class Circle{
	
	int radius;
	
	Circle(int radius)
	{
		this.radius = radius;
	}
	
	// To access the radius
	int getRadius()
	{
		return radius;
	}
	
	// To modify the radius
	void setRadius() {
		
		this.radius = radius;
	}
	
	void area() {
		
		double areaOfCircle = 3.14 * radius * radius;
		System.out.println("Area of Circle is : " + areaOfCircle);
		
	}
	
	void circumference() {
		
		double circumferenceOfCircle = 2 * 3.14 * radius;
		System.out.println("Circumference of a Circle is : " + circumferenceOfCircle);
	}
	
	
}
public class Assignment4 {

	public static void main(String[] args) {
		
		
		Circle circle = new Circle(5);
		circle.area();
		circle.circumference();

	}

}
