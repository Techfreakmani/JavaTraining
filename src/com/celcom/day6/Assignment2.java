package com.celcom.day6;

import java.util.Scanner;

class VowelFound extends Exception{
	
	public String toString() {
		return "Vowel Found";
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Name");
		String name = sc.next();
		
		isNotVowel(name);

	}
	
	static void isNotVowel(String name) {
		
		try {
			int count = 0;
			for(int i = 0; i < name.length(); i++)
			{
				if(name.charAt(i) == 'a'|| name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) =='u' || name.charAt(i) =='A' || name.charAt(i) == 'E' || name.charAt(i) =='I' || name.charAt(i) =='O' || name.charAt(i) =='U'){
					count ++;
				}
			}
			if(count > 0)
			{
				throw new VowelFound();
			}
		}catch(VowelFound e)
		{
			System.out.println(e);
		}
		
		
	}

}
