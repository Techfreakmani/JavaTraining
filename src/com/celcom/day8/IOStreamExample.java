package com.celcom.day8;

import java.io.IOException;
import java.io.FileReader;
public class IOStreamExample {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D:\\JavaTraining\\JavaProject\\src\\com\\celcom\\day8\\Example.txt");
		int ch = 0;
		while((ch = fr.read()) != -1)
		{
			System.out.println((char)ch);
		}
		fr.close();
	}

}
