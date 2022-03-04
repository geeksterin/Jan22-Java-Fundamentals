package com.geekster.shapepractice;

public class Driver {

	public static void main(String[] args)
	{
		Rectangle rObj = new Rectangle(4,5);
		rObj.printArea();
		rObj.printPerimeter();
		
		Square sObj = new Square(5);
		sObj.printArea();
		sObj.printPerimeter();
		
		Shape s = new Square(5);
		Shape d = new Rectangle(3, 4);
		
		
		//In an array
		Shape[] shapeArray  = new Shape[2];
		shapeArray[0] = rObj;
		shapeArray[1] = sObj;
		
		for(int i =0; i< 2;i++)
		{
			shapeArray[i].printArea();
		}
	}
	
	
}
