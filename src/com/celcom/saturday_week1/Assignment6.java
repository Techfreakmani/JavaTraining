package com.celcom.saturday_week1;

class Employee{
	
	String ename;
	String jobTitle;
	double esalary;
	
	Employee(String ename, String jobTitle, double esalary){
		this.ename = ename;
		this.jobTitle = jobTitle;
		this.esalary = esalary;
		
		
	}
	
	//To calculate Salary of Employee
	void calculateSalary() {
		
		System.out.println("The salary of " + ename + " for " + jobTitle + " role is " + esalary);
		
		
	}
	
	//To modify the salary 
	void setSalary()
	{
		this.esalary = esalary;
	}
}

public class Assignment6 {

	public static void main(String[] args) {
		Employee employee = new Employee("Manikandan", "Software Engineer" , 500000);
		employee.calculateSalary();
		

	}

}
