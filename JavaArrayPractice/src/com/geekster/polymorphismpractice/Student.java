package com.geekster.polymorphismpractice;

public class Student {

	String studentId;
	double totalMarks;
	
	//Method overloading / static polymorphism
	public void setStudentId(String id)
	{
		studentId = id;
	}
	// type of arg, number of arg
	
	public void setStudentId(int id)
	{
		studentId = Integer.toString(id);
		
	}
	
	public void calculateTotalMarks(int a, int b)
	{
		totalMarks = a + b;
		System.out.println("Total marks : " + totalMarks);
	}
	
	public void calculateTotalMarks(int a, int b, double c)
	{
		totalMarks = a + b + c;
		System.out.println("Total marks : " + totalMarks);
	}

}
