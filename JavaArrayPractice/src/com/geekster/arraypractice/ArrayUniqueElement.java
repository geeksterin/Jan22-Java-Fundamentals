package com.geekster.arraypractice;

import java.util.Arrays;

public class ArrayUniqueElement {

	public static void main(String[] args)
	{
		int[] inputArray = {1,2,3,4,3,2,1};
		findUniqueElement(inputArray);
		
	}
	
	/*
	 * All the elements are repeated twice - XOR
	 */
	private static void findUniqueElement(int[] inputArray)
	{
		int result = inputArray[0];
		for(int i =1; i< inputArray.length; i++)
		{
			result = result^inputArray[i];
			
		}
		System.out.println(result);
	}	
}






