package com.geekster.polymorphismpractice;

public class DriverMain {

	public static void main(String[] args)
	{
		Surgeon s = new Surgeon();
		//s.makeIncision();
		//s.treatPatients();
		
		Paediatric p = new Paediatric();
		//p.treatPatients();
		
		
		
		
		Doctor[] doctors = new Doctor[7];
		doctors[0] = new Surgeon();
		//doctors[1] = new Paediatric();
		//doctors[2] = new Paediatric();
		//doctors[3] = new Dentist();
		
		//for(int i = 0; i< 4 ;i++)
			doctors[0].treatPatients();
	
	}

	//Dynamic Polymorphism
}
