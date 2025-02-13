package com.celcom.day8;

//Earlier we use this now we have split method
import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String s1 = "Welcome to Java Programming";
		StringTokenizer st = new StringTokenizer(s1, " ");
		System.out.println(st.countTokens()); //4
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		

	}

}
