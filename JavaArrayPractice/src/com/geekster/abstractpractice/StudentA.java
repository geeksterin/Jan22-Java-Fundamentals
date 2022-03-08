package com.geekster.abstractpractice;

public class StudentA extends Marks {

	double m1, m2, m3;
	public StudentA(double m1, double m2, double m3) {
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	@Override
	public double getPercentage() {
		// TODO Auto-generated method stub
		double percent = ((m1+m2+m3)/300)*100;
		return percent;
	}

}
