package com.celcom.day6;

public class ObjectCloningExample1 implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
		
		ObjectCloningExample1 obj1 = new ObjectCloningExample1();
		ObjectCloningExample1 obj2 = (ObjectCloningExample1) obj1.clone();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		

	}

}
