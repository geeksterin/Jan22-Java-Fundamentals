package com.geekster.authorbook;

public class Book {

	private String name;
	private Author author;
	private double price;
	private int qty;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public Book(String name, Author author, double price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public Book(String name, Author author, double price, int qty) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book name : " + name + "\n Book Author : " + author + "\nBook Price = Rs. " + price;
	}
	
}
