package com.celcom.day6;

public class GarbageCollectionExample1 {
	
	static int count;
	public GarbageCollectionExample1() {
		
		count++;
		System.out.println(count);
	}
	
	protected void finalize() {
		
		count--;
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		GarbageCollectionExample1 obj1 = new GarbageCollectionExample1();
		GarbageCollectionExample1 obj2 = new GarbageCollectionExample1();
		obj1 = null;
		obj2 = null;
		
		System.gc();
		//Runtime.getRuntime().gc;
		
		GarbageCollectionExample1 obj3 = new GarbageCollectionExample1();
		GarbageCollectionExample1 obj4 = new GarbageCollectionExample1();

	}

}
