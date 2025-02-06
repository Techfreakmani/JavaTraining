package com.celcom.day3;

class Mobile{
	String Brand;
	int Price;
	String Model;
	
	Mobile(String Brand, int Price, String Model){
		this.Brand = Brand;
		this.Price = Price;
		this.Model = Model;
		
	}
	
	void display() {
		System.out.print(Brand + " " + Price +" " + Model);
	}
}
public class MobilePhone {
	public static void main(String[] args) {
		
		Mobile m = new Mobile("Samsung", 50000 , "s23");
		m.display();
		
	}
	
}
