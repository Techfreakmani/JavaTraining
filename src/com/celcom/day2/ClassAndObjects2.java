package com.celcom.day2;

class Fruits{
	String color;
	int size;
	int price;
	
	//constructor
	Fruits(String color, int size, int price){
		this.color = color;
		this.size = size;
		this.price = price;
	}
	
	void display() {
		System.out.println("Fruit color :" + color);
		System.out.println("Fruit size :" + size);
		System.out.println("Fruit price :" + price);
	}
	
	void setPrice(int price)
	{
		this.price = price;
	}
	
}


public class ClassAndObjects2 {
	public static void main(String[] args)
	{
		Fruits f = new Fruits("Red",20,300);
		f.display();
		
		f.setPrice(500);
		
		f.display();
	}
	

}
