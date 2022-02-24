package com.geekster.oopspractice;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setEmp_id(1);
		emp1.setEmp_name("John");
		emp1.setEmp_years_exp(5);
		
		
		Employee emp2 = new Employee(2, "Mike");
		emp2.setEmp_years_exp(6);
		emp2.setEmp_working_hrs(5);
		emp2.setEmp_bill_rate(200);
		emp2.setEmp_salary();
		
		System.out.println("Salary of " + emp2.getEmp_name() + " = Rs. " + emp2.getEmp_salary());
		
		
		//Number of employees objects
		emp1.displayData();
		emp2.displayData();

	}

}

