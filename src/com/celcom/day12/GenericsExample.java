package com.celcom.day12;

class Example<T>{
	
	private T age;
	private T a;

	public Example(T age) {
		this.age = age;
	}

	public T getAge() {
		return age;
	}

	public void setAge(T age) {
		this.age = age;
	}
	

	public void setA(T a) {
		this.a = a;
	}

	public T isprint(){
		return a;
		
	}
	
	
	
}

public class GenericsExample {

	public static void main(String[] args) {
		Example exp = new Example("manikandan");
		System.out.println(exp.getAge());
		exp.setA(10.989);
		System.out.println(exp.isprint());
		
		
	}

}
