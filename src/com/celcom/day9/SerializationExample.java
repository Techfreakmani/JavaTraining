package com.celcom.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	transient public int eid;
	private String ename;
	private int esalary;
	public Employee(int eid, String ename, int esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
	
	
}
public class SerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee employee = new Employee(1001, "Manikandan",50000);
		
		//Serialization
		FileOutputStream fout = new FileOutputStream("D://serialization.txt"); //creating a new file
		ObjectOutputStream objout = new ObjectOutputStream(fout); // converting text format to bytecode
		objout.writeObject(employee); //copying
		objout.close();
		fout.close();
		System.out.println("Object saved");
		
		
		//Deserialization
		FileInputStream fin = new FileInputStream("D://serialization.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Employee emp = (Employee) objin.readObject();
		objin.close();
		fin.close();
		System.out.println(emp);
		
		
		
	}

}
