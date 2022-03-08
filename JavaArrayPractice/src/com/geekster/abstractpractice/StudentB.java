package com.geekster.abstractpractice;

public class StudentB extends Marks {

	double m1, m2, m3,m4;
	public StudentB(double m1, double m2, double m3, double m4) {
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}
	
	@Override
	public double getPercentage() {
		// TODO Auto-generated method stub
		double percent = ((m1+m2+m3+m4)/400)*100;
		return percent;
	}

}
