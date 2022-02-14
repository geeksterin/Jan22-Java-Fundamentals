package com.geekster.arraypractice;

import java.util.Arrays;

public class ArrayCandyExample {

	public static void main(String[] args)
	{
		
		kidsCandies(new int[] {12,1,12}, 10);
	}
	
	
	private static String[] kidsCandies(int[] candies, int extraCandies) 
	{
		String[] temp=new String[candies.length];
		int maxCandies = Integer.MIN_VALUE;
		for (int val : candies) {
			maxCandies = Math.max(maxCandies, val);
		}
		for(int i=0;i<candies.length;i++)
		{
			temp[i]=(candies[i]+extraCandies>=maxCandies)?"true":"false";
		}
		System.out.println(Arrays.toString(temp));
		return temp;
	}
	
}






