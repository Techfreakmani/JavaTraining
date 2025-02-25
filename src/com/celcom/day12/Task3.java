package com.celcom.day12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
 
public class Task3 {
	
	
	static void emailValidator(String email) {
		
		String regex = "^[a-zA-Z0-9.]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(email);
 
	    if (matcher.matches()) {
	        System.out.println("It is a valid email address");
	    } else {
	        System.out.println("It is NOT a valid email address");
	    }
	}
	
	static void phoneNumberValidator(String number) {
		String regex="^[0-9]{10}$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher= pattern.matcher(number);
		
		if (matcher.matches()) {
	        System.out.println("It is a valid Number");
	    } else {
	        System.out.println("It is not a valid Number");
	    }
		
	}
	
	static void passwordValidator(String password) {
		String regex="^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&])(?=.*[0-9])[a-zA-Z0-9@!#$%^&*]{8,}$";
		
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher= pattern.matcher(password);
		
		if (matcher.matches()) {
	        System.out.println("It is a valid password");
	    } else {
	        System.out.println("It is not a valid password");
	    }
		
	}
 
 
	public static void main(String[] args) {
		
		passwordValidator("Manikandan2003@");
		
		String number="7338865955";
		phoneNumberValidator(number);
		
		String email = "manimani123@gmail.com";
		emailValidator(email);
		
	}
 
}
