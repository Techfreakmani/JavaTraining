package com.celcom.assignmentweek1;


class Rectangle{
	
	int width;
	int height;
	
	Rectangle(int width, int height){
		
		this.width = width;
		this.height = height;
	}
	
	void perimeter()
	{
		
		System.out.println("Perimeter of Rectangle is :" + 2 * (width + height));
	}
	
	void area() {
		
		System.out.println("Area of Rectangle is :" + (width * height));
	}
	
	
}
public class Assignment3 {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10,20);
		rectangle.perimeter();
		rectangle.area();

	}

}
