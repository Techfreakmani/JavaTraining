package com.celcom.jdbc_example;

public class EmployeeManagementSystem {
	private int eid;
	private String ename;
	private int age;
	private double esalary;
	private long ephoneNumber;

	public int getEid() {
		return eid;
	}


	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	public long getEphoneNumber() {
		return ephoneNumber;
	}

	public void setEphoneNumber(long ephoneNumber) {
		this.ephoneNumber = ephoneNumber;
	}

}
