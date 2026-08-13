package com.javafumdamentals;

import java.util.Arrays;

public class LibraryBook {
	int bookId;
	String bookTitle;
	String authorName;
	int availableCopies;
	static String libraryName;
	static String librarianName;
	void displayBookDetails() {
		System.out.println("Book Id: "+bookId);
		System.out.println("Book Name: "+bookTitle);
		System.out.println("Author Name: "+authorName);
		System.out.println("Available Copies: "+availableCopies);
	}
	void displayLibraryDetails() {
		System.out.println("Library Name: "+libraryName);
		System.out.println("Librarian Name: "+librarianName);
		
	}
	void changeLibrarian() {
		librarianName="Anand";
		
			}
	

	public static void main(String[] args) {
		libraryName="Central Library";
		librarianName="Shashank";
		LibraryBook lb1=new LibraryBook();
		lb1.bookId=1;
		lb1.bookTitle="JAVA";
		lb1.authorName="James Gosling";
		lb1.availableCopies=30;
		
		lb1.displayBookDetails();
		lb1.displayLibraryDetails();
		System.out.println("***********************************************************************************");
		LibraryBook lb2=new LibraryBook();
		lb2.bookId=2;
		lb2.bookTitle="c";
		lb2.authorName="charli";
		lb2.availableCopies=40;
		lb2.changeLibrarian();
		lb2.displayBookDetails();
		lb2.displayLibraryDetails();
		

	}

}
