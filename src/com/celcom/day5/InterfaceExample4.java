package com.celcom.day5;


interface InterfaceOne{
	
	int a = 10;
	//by default interface variables are public static and final
	//by default interface methods are public abstract
	
}

interface InterfaceTwo{
	
	int a =20;
}

interface InterfaceThree extends InterfaceOne,InterfaceTwo{
	
	void addition();
	
}

class Addition implements InterfaceThree{
	
	public void addition()
	{
		System.out.println(InterfaceOne.a + InterfaceTwo.a);
	}
}
public class InterfaceExample4 {

	public static void main(String[] args) {
		
		Addition add = new Addition();
		add.addition();
	}

}
