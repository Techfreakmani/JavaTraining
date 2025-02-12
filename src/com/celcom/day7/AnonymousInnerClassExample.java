package com.celcom.day7;

interface Interface1{
	void display();
}

public class AnonymousInnerClassExample {

	public static void main(String[] args) {
		
		Interface1 obj1 = new Interface1() {
			 public void display()
			 {
				 System.out.println("Display");
			 }
		};
		
		obj1.display();
		
		//Lambda Expression
		
		Interface1 obj2 = () -> System.out.println("Display1");
		obj2.display();
		

	}

}
