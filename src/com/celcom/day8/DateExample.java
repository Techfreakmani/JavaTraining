package com.celcom.day8;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.getMonth());
		System.out.println(date.getDate());
		System.out.println(date.getHours());
		System.out.println(date.getYear() + 1900);

	}

}
