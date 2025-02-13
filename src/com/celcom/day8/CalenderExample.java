package com.celcom.day8;

import java.util.Calendar;

public class CalenderExample {

	public static void main(String[] args) {
		
		//its is a singleton class so oject is not created
		Calendar c = Calendar.getInstance();
		
		System.out.println(c);
		System.out.println(c.get(c.DATE));
		System.out.println(c.get(c.HOUR));
		System.out.println(c.get(c.YEAR));
		System.out.println(c.get(c.MINUTE));
		System.out.println(c.get(c.SECOND));
		System.out.println(c.get(c.MONTH));
		
		

	}

}
