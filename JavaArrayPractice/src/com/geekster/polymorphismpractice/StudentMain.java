package com.geekster.polymorphismpractice;

public class StudentMain {

	public static void main(String[] args)
	{
		Student stud1 = new Student();
		stud1.setStudentId("1");
		stud1.calculateTotalMarks(50, 60);
		Student stud2 = new Student();
		stud2.setStudentId(2);
		stud2.calculateTotalMarks(40, 10, 20.5);
		
		
		
	}

}
