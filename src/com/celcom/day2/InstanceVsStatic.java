package com.celcom.day2;

public class InstanceVsStatic {
	int a =10;
	static int b =100;

	public static void main(String[] args) {
		InstanceVsStatic obj1 = new InstanceVsStatic();
		InstanceVsStatic obj2 = new InstanceVsStatic();
		
		//before changing instance variable
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		obj1.a =30;
		
		//after changing instance variable
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		//before changing static variable
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
		obj1.b =500;
		
		//after changing static variable
		System.out.println(obj1.b);
		System.out.println(obj2.b);

	}

}
