package com.celcom.day3;


import java.util.Scanner;

class Shape1 {
	int radius;
	int length;
	int breadth;
	float height;

	Shape1() {

	}

	Shape1(int radius) {
		this.radius = radius;

	}

	Shape1(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	Shape1(int length, float height) {
		this.length = length;
		this.height = height;
	}

	void calculate() {

	}

}

class Circle extends Shape1 {
	double areaOfCircle;

	Circle(int radius) {
		this.radius = radius;		
	}

	void calculate() {
		areaOfCircle = Math.PI * radius * radius;
		System.out.println("Area of circle is :");
		System.out.println(areaOfCircle);
	}

}

class Rectangle extends Shape1 {
	double areaOfRectangle;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		System.out.println("Area of Rectangle is :");
	}

	void calculate() {
		areaOfRectangle = length * breadth;
		System.out.println(areaOfRectangle);
	}
}

class Triangle extends Shape1 {
	double areaOfTriangle;

	Triangle(int length, int height) {
		this.length = length;
		this.height = height;
		

	}

	void calculate() {
		areaOfTriangle = 0.5 * length * height;
		System.out.println("Area of Triangle is :");
		System.out.println(areaOfTriangle);
	}
}

public class Shape {

	public static void main(String[] args) {
		Shape1 shape;
		System.out.println("Enter your choice :)");

		Scanner sc = new Scanner(System.in);

		int choice = sc.nextInt();

		if (choice == 1) {
			System.out.println("Enter radius");
			shape = new Circle(sc.nextInt());
			shape.calculate();
		}

		else if (choice == 2) {
			System.out.println("Enter length and Breadth");
			shape = new Rectangle(sc.nextInt(), sc.nextInt());
			shape.calculate();
		} else if (choice == 3) {
			System.out.println("Enter length and height");
			shape = new Triangle(sc.nextInt(), sc.nextInt());
			shape.calculate();
		}

	}

}
