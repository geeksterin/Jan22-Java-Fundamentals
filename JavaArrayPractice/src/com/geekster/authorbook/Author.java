package com.geekster.authorbook;

public class Author {

	private String name;
	private String email;
	private char gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Author Name : " + name + "\nAuthor email : " + email + "\nAuthor Gender :  " + gender;
	}
}
