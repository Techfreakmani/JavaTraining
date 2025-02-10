package com.celcom.saturday_week1_08_feb_2025;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


//Write a Java program to create a class called "Book" with attributes 
//for title, author, and ISBN, and methods to add and remove books from a collection.

class Book{
	
	String title;
	String author;
	final long ISBN;
	
	static Set<Book> listOfBooks = new HashSet<>();
	
	Book(String title, String author, long ISBN)
	{
		
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	
	void addNewBook()
	{
		
		listOfBooks.add(this);
		System.out.println("Book is Added sucessfully");
		System.out.println("----------------------");

		
		
	}
	
	
	
	
	
	
	
}

public class Assignment5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.println("1.Add a New Book");
			System.out.println("2.Delete a Book");
			System.out.println("3.View the Booklist");
			
			int choice = sc.nextInt();
			
			
			if(choice == 1)
			{
				System.out.println("Please Enter BookName, AuthorName and ISBN");
				Book book = new Book(sc.next(),sc.next(),sc.nextLong());
				book.addNewBook();
				
				
			}
			
			else if(choice == 2)
			{
				System.out.println("Please Enter ISBN to delete a Book");
				long choice2 = sc.nextLong();
				
				for(Book book : Book.listOfBooks) {
					if(book.ISBN == choice2)
					{
						Book.listOfBooks.remove(book);
						return;
						
					}
					
					System.out.println("Enter a valid ISBN");
					
					
				}
			}
			
			else if(choice == 3)
			{
				for(Book book: Book.listOfBooks)
				{
					System.out.print("The book name is " + book.title + " and the author name is " + book.author);
					
				}
			}
			
			else {
				System.out.println("Please Enter a valid choice");
				System.out.println("Thankyou visit again :)");
				break;
			}
			
			
		}
		
		

	}

}
