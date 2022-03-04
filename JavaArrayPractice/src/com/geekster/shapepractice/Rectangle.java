package com.geekster.shapepractice;

public class Rectangle extends Shape{

	//Instance Variables
	private int length;
	private int breadth;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		System.out.println("Area : " + length*breadth);
	}
	@Override
	public void printPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter : " + 2*(length+breadth));
	}
	
	
}
