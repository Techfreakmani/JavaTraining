package com.celcom.day2;


//Types ofMethods in java
public class Methods {
	static int a =10;
	void m1() {
		System.out.println("Instance Method");
	}
	
	static void m2() {
		System.out.println("Static method");
	}

	public static void main(String[] args) {
		Methods m = new Methods();
		m.m1();
		m2();
		}

}
