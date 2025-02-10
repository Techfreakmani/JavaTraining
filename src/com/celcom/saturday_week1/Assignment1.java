package com.celcom.saturday_week1;


class Person{
	
	String name;
	int age;
	
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void display() {
		
		System.out.println("Name of the Person is :" + name);
		System.out.println("Age of the Person is :" + age);
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		
		Person person = new Person("Manikandan", 21);
		person.display();
		
		System.out.println("------------------------------");
		
		Person person1 = new Person("Yuvaraj" , 19);
		person1.display();
		
	}

}
