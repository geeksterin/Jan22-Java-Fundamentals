package com.geekster.authorbook;

public class Maindriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Author author = new Author("James G", "james@gmail.com", 'm');
		//System.out.println("Author details : \n" + author);
		
		
		Book newbook = new Book("Java Basics", author, 230.0);
		System.out.println("Book details : \n" + newbook);
	}

}
