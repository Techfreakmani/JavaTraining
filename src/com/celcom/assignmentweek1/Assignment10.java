package com.celcom.assignmentweek1;


class Shape{
	
	int length;
	int breadth;
	
	void getArea()
	{
		
	}
}

class Rectangle1 extends Shape{
	
	Rectangle1(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	void getArea()
	{
		double areaOfRectangle = length * breadth;
		
		System.out.println("Area of Rectangle is :" + areaOfRectangle);
	}
}

public class Assignment10 {

	public static void main(String[] args) {
		Rectangle1 rectangle = new Rectangle1(5, 10);
		rectangle.getArea();
		
	}

}
