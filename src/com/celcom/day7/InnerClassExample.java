package com.celcom.day7;

public class InnerClassExample {

	// 1. Non-Static Inner Class
	class InnerClass1 {
		void myMethod() {
			System.out.println("Non-Static Inner Class");
		}
	}

	// 2. Static Inner Class
	static class InnerClass2 {
		void myMethod() {
			System.out.println("Static Inner Class");
		}
	}

	// 3. Local Inner Class

	void myMethod() {
		class InnerClass3 {
			void Method() {
				System.out.println("Local Inner Class");
			}
		}
	}
	
	
	// 4.Anonymous inner class

	public static void main(String[] args) {

		// Object creation for non-static inner class
		InnerClassExample obj = new InnerClassExample();
		InnerClass1 obj1 = obj.new InnerClass1();
		obj1.myMethod();

		// Object creation for static inner class
		InnerClassExample.InnerClass2 obj2 = new InnerClassExample.InnerClass2();
		obj2.myMethod();

	}

}
