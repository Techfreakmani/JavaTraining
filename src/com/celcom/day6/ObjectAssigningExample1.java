package com.celcom.day6;

public class ObjectAssigningExample1 {

	public static void main(String[] args) {
		
		ObjectAssigningExample1 obj1 = new ObjectAssigningExample1();
		System.out.println(obj1.hashCode());
		
		ObjectAssigningExample1 obj2 = new ObjectAssigningExample1();
		System.out.println(obj2.hashCode());
		
		ObjectAssigningExample1 obj3 = obj1;
		System.out.println(obj3.hashCode());
	}

}
