package com.geekster.matricespractice;

import java.util.Scanner;

public class MatricesPractice {

	public static void main(String[] args)
	{
		int[][] input1 = {{1,0,1},{1,3,4}};
		int[][] input2 = {{1,0,1},{1,2,4}};
		int[][] inputIdentity = {{1,0,0},{0,1,0}, {0,0,1}};
		
		//Check if matrices are identical
		boolean isIdentical = isIdenticalMatrix(input1, input2);
		System.out.println("Are Matrices Equal? :  " + isIdentical);
		
		
		//Sum of Row and Column Elements
		sumOfElements(input1);
		
		//Accept elements of matrix from user
		acceptUserInput();
		
		//Check if matrices are identical
		boolean isIdentity = isIdentityMatrix(inputIdentity);
		System.out.println("Is Identity Matrix? :  " + isIdentity);
	}
	
	
	/*
	 * 1.) Traverse the matrix -> For loop
	 * 2.) Compare the elements and check for equality
	 */
	private static boolean isIdenticalMatrix(int[][] input1 , int[][] input2)
	{
		if(input1.length != input2.length)
			return false;
		for(int i =0; i< input1.length; i++)
		{
			for(int j =0; j< input1.length; j++)
			{
				if(input1[i][j] != input2[i][j])
					return false;
			}
		}
		return true;
	}
	
	//Sum of row and column elements
	private static void sumOfElements(int[][] input1)
	{
		
		int numRows = input1.length;
		int numColumns = input1[0].length;
		
		for(int i =0; i< numRows; i++)
		{
			int rowSum = 0;
			for(int j=0; j< numColumns; j++)
			{
				rowSum = rowSum + input1[i][j];
			}
			System.out.println("Sum of Row " + i + " = " + rowSum);
		}
		
		for(int i =0; i<numColumns;i++)
		{
			int columnSum = 0;
			for(int j =0; j< numRows ; j++)
				columnSum = columnSum + input1[j][i];
			System.out.println("Sum of Coulmn " + i + " = " + columnSum);
		}
	}
	
	
	private static void acceptUserInput()
	{
		Scanner sc = new Scanner(System.in);
		
		int numRows, numColumns;
		System.out.println("Enter the number of rows");
		numRows = sc.nextInt();
		
		System.out.println("Enter the number of columns");
		numColumns = sc.nextInt();
		
		int[][] inputMatrix = new int[numRows][numColumns];
		
		System.out.println("Enter the elements : ");
		for(int i =0; i< numRows; i++)
		{
			for(int j =0; j<numColumns ;j++)
				inputMatrix[i][j] = sc.nextInt();
		}
		
		
		System.out.println("Matrix elements are : ");
		for(int i =0; i< numRows; i++)
		{
			for(int j =0; j<numColumns ;j++)
				System.out.print(inputMatrix[i][j] + " ");
			System.out.println();
		}
		
	}
	
	private static boolean isIdentityMatrix(int[][] identityInput) {
		int numRow = identityInput.length;
		int numCol = identityInput[0].length;
		if (numRow != numCol)
			return false;
		else
		{
			for (int i = 0; i < numRow; i++) {
				for (int j = 0; j < numCol; j++) {
					if ( (i == j && identityInput[i][j] != 1) || (i !=j && identityInput[i][j] != 0))
						return false;
				}
			}
		}
		return true;
	}

}


