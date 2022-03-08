package com.geekster.abstractpractice;

public class MatrixPractice {

	int row;
	int column;
	int[][] a;
	
	public MatrixPractice(int rows, int columns) {
		row = rows;
		column = columns;
		a = new int[row][column];
	}
	
	//Return number of rows
	public int getRows()
	{
		return row;
	}
	
	public int getColumns()
	{
		return column;
	}
	
	public void setElement(int rowNum, int colNum, int value)
	{
		a[rowNum][colNum] = value;
	}
	
	public int getElement(int rowNum, int colNum)
	{
		
		return a[rowNum][colNum];
	}
	
	public void printMatrix()
	{
		System.out.println("Matrix is :");
		for(int i =0; i< row; i++)
		{
			for(int j =0; j<column;j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	//addMatrix(mat1, mat2)
	
	public static MatrixPractice add(MatrixPractice mat1, MatrixPractice mat2)
	{
		//Validate
		if(mat1.row == mat2.row && mat1.column == mat2.column)
		{
			
			MatrixPractice resultMat = new MatrixPractice(mat1.row, mat1.column);
			for(int i =0; i<mat1.row;i++)
			{
				for(int j =0; j<mat1.column; j++)
				{
					int value = mat1.getElement(i, j) + mat2.getElement(i, j);
					resultMat.setElement(i,j,value);
					
				}
			}
			return resultMat;
		}
		return null;
	}
}
