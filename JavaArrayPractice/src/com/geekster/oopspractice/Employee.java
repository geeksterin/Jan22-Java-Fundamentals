package com.geekster.oopspractice;

public class Employee {

	private int emp_id;
	private String emp_name;
	private int emp_rating;
	private int emp_years_exp;
	//Per week
	private int emp_working_hrs;
	private int emp_bill_rate;
	private int emp_salary;
	
	public Employee()
	{
		
	}
	
	public Employee(int empId, String name)
	{
		emp_id = empId;
		emp_name = name;
	}
	
	public Employee(int empId, String name, int empRating, int yrsExp, int workHours, int billRate)
	{
		emp_id = empId;
		emp_name = name;
		emp_rating = empRating;
		emp_years_exp = yrsExp;
		emp_working_hrs = workHours;
		emp_bill_rate = billRate;
	}
	

	
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) 
	{
		this.emp_id = emp_id;
	}
	
	public String getEmp_name() 
	{
		return emp_name;
	}
	
	public void setEmp_name(String emp_name) 
	{
		this.emp_name = emp_name;
	}
	public int getEmp_rating() {
		return emp_rating;
	}
	public void setEmp_rating(int emp_rating) {
		this.emp_rating = emp_rating;
	}
	public int getEmp_years_exp() {
		return emp_years_exp;
	}
	public void setEmp_years_exp(int emp_years_exp) {
		this.emp_years_exp = emp_years_exp;
	}
	public int getEmp_working_hrs() {
		return emp_working_hrs;
	}
	public void setEmp_working_hrs(int emp_working_hrs) {
		this.emp_working_hrs = emp_working_hrs;
	}
	public int getEmp_bill_rate() {
		return emp_bill_rate;
	}
	public void setEmp_bill_rate(int emp_bill_rate) {
		this.emp_bill_rate = emp_bill_rate;
	}
	public int getEmp_salary() {
		return emp_salary;
	}
	
	public void setEmp_salary() {
		
		if(emp_bill_rate > 0 && emp_working_hrs > 0)
			this.emp_salary = (emp_working_hrs * 4) * emp_bill_rate;
		
	}
	
	
	public void displayData()
	{
		System.out.println("Employee Name : " + emp_name);
		System.out.println("Years of experience : " + emp_years_exp);
		
	}
	
}
