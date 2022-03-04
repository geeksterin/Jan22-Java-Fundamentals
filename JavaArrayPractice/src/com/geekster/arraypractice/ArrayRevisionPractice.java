package com.geekster.arraypractice;

import java.util.Arrays;

public class ArrayRevisionPractice {

	public static void main(String[] args) {
		
		arrayOperations();
		splitArray();
		
		//boolean isFound = numberToSearch();
		reverseArray();
		
		

	}
	
	private static boolean numberToSearch()
	{
		int[] inputArray = {1,2,3,4,5,6,7,8,9};
		int numberToSearch = 9;
		int flag = 0;
		for(int i =0; i< inputArray.length ;i++)
		{
			if(inputArray[i] == numberToSearch)
				return true;
				
		}
		return false;
	}

	private static void reverseArray()
	{
		int[] inputArray = {1,2,3,4,5,6,7,8,9};
		int[] outputArray = new int[inputArray.length];
		int j =0;
		
		for(int i = inputArray.length -1; i>=0; i--)
		{
			
			outputArray[j] = inputArray[i];
			j++;
		}
		System.out.println(Arrays.toString(outputArray));
		
	}
	
	private static void splitArray()
	{
		int[] inputArray = {58,24,13,15,63,9,8,81,1,78};
		int middleIndex = inputArray.length/2;
		
		int[] outputArray1 = new int[middleIndex];
		int[] outputArray2 = new int[middleIndex];
		
		for(int i =0; i< middleIndex ;i++)
			outputArray1[i] = inputArray[i];
		
		for(int i =middleIndex ;i<inputArray.length; i++)
			outputArray2[i - middleIndex] = inputArray[i];
		System.out.println(Arrays.toString(outputArray1));
		System.out.println(Arrays.toString(outputArray2));
	}
	
	private static void circularRightShift()
	{
		int[] inputArray = {1,2,3,4,5};
		int lastIndex = inputArray.length - 1;
		int firstElement = inputArray[lastIndex];
		
		for(int i = lastIndex; i>0; i--)
		{
			inputArray[i] = inputArray[i-1];
		}
		inputArray[0] = firstElement;
		System.out.println(Arrays.toString(inputArray));
		
	}
	
	private static void arrayOperations()
	{
		String[] operations = {"--X", "X++","X++"};
		int y = 0;
		
		for(String op : operations)
		{
			switch(op){
			case "--X":
			case "X--":
				y = y-1;
				break;
			case "++X":
			case "X++":
				y = y+1;
				break;
			
			}
		}
		System.out.println("Output : "+ y);
	}
}




