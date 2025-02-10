package com.celcom.day5;

import java.util.Scanner;

interface Area{
	
	void calculateArea();
	
}

interface Perimeter{
	
	void calculatePerimeter();
}

	abstract class Shape1 implements Area,Perimeter {
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

	}

	class Circle extends Shape1 {
		double areaOfCircle;
		double perimeterOfCircle;

		Circle(int radius) {
			this.radius = radius;		
		}

		public void calculateArea() {
			areaOfCircle = Math.PI * radius * radius;
			System.out.println("Area of circle is :");
			System.out.println(areaOfCircle);
		}
		
		
		public void calculatePerimeter()
		{
			perimeterOfCircle = 2 * Math.PI * radius;
			System.out.println("Perimeter of Circle is :");
			System.out.println(perimeterOfCircle);
			
		}

	}

	class Rectangle extends Shape1 {
		double areaOfRectangle;
		double perimeterOfRectangle;

		Rectangle(int length, int breadth) {
			this.length = length;
			this.breadth = breadth;
			System.out.println("Area of Rectangle is :");
		}

		public void calculateArea() {
			areaOfRectangle = length * breadth;
			System.out.println(areaOfRectangle);
		}
		
		public void calculatePerimeter()
		{
			perimeterOfRectangle = 2 * (length + breadth);
			System.out.println(perimeterOfRectangle);
			
		}
	}

	class Triangle extends Shape1 {
		double areaOfTriangle;
		double perimeterOfTriangle;

		Triangle(int length, int height) {
			this.length = length;
			this.height = height;
			

		}

		public void calculateArea() {
			areaOfTriangle = 0.5 * length * height;
			System.out.println("Area of Triangle is :");
			System.out.println(areaOfTriangle);
		}
		
		public void calculatePerimeter(){
			 perimeterOfTriangle = length + height + height;
			 System.out.println("Perimeter of Triangle :");
			 System.out.println( perimeterOfTriangle);
			
		}
	}

	public class InterfaceExample3 {

		public static void main(String[] args) {
			Shape1 shape;
			System.out.println("Enter your choice :)");

			Scanner sc = new Scanner(System.in);

			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("Enter radius");
				shape = new Circle(sc.nextInt());
				shape.calculateArea();
				shape.calculatePerimeter();
			}

			else if (choice == 2) {
				System.out.println("Enter length and Breadth");
				shape = new Rectangle(sc.nextInt(), sc.nextInt());
				shape.calculateArea();
				shape.calculatePerimeter();
			} else if (choice == 3) {
				System.out.println("Enter length and height");
				shape = new Triangle(sc.nextInt(), sc.nextInt());
				shape.calculateArea();
				shape.calculatePerimeter();
			}

		}

	}
