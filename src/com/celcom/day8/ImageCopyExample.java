package com.celcom.day8;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ImageCopyExample {

	public static void main(String[] args) throws IOException {
		FileInputStream fr = new FileInputStream("D:\\Image.jpg");
		FileOutputStream fw = new FileOutputStream("D:\\Image1.jpg");
		int ch = 0;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("Image Copied");
	}

}
