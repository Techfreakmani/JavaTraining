package com.celcom.day2;

class Employee {

	int eid;
	String ename;
	double esalary;
	
	//Constructor
	Employee(int eid, String ename, double esalary){
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		
	}
	
	void display() {
		System.out.println("Employee Id :" + eid);
		System.out.println("Employee Name :" + ename);
		System.out.println("Employee Salary :" + esalary);
		
	}

}

public class MyClass{
	public static void main(String[] args) {
		Employee e = new Employee(101, "Manikandan",2000000000.00);
		e.display();
	}
}
