package com.geekster.polymorphismpractice;

public class Surgeon extends Doctor {

	//Method overriding
	@Override
	public void treatPatients() {
		super.treatPatients();
		System.out.println("Make incision");
	}
	
	@Override
	protected Surgeon testOverriding(int a)
	{
		return null;
	}

	
	
}
