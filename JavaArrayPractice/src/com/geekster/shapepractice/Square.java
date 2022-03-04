package com.geekster.shapepractice;

public class Square extends Shape {

	int side;
	public Square (int side)
	{
		this.side = side;
	}
	@Override
	public void printArea() {
		
		System.out.println("Area : " + side*side);
	}

	@Override
	public void printPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Square : " + 4*side);
	}

	

	//Print area and perimeter
}
