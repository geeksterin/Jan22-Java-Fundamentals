package com.geekster.polymorphismpractice;

public class Doctor {

	 boolean worksAtHospital;
	
	public void treatPatients()
	{
		System.out.println("Doctor - treat Patients");
	}
	protected Doctor testOverriding(int a)
	{
		System.out.println("Test");
		return null;
	}

	//Arguments, name, return type = compatible
}
