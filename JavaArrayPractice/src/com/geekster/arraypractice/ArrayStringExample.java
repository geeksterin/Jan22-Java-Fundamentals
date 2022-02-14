package com.geekster.arraypractice;

public class ArrayStringExample {
	
	public static void main(String[] args)
	{
		String[] word1 = {"ab", "c", "def","gh"};
		String[] word2 = {"a", "bc"};
		boolean isEqual = isArrayStringEqual(word1, word2);
		System.out.println(isEqual);
	}
	
	private static boolean isArrayStringEqual(String[] word1, String[] word2)
	{
		
		/*
		 * 1.) Figure out String 1 => word1
		 * 2.) Figure out String 2=> word2
		 * 3.) COmpare two strings
		 */
		String result1 = "";
		for(String str : word1)
		{
			//word1[0]+word1[1]
			result1 = result1+ str;
		}
		System.out.println("First array string : " + result1);
		
		String result2 = "";
		for(String str : word2)
		{
			result2 = result2+ str;
		}
		System.out.println("Second array string : " + result2);
		
		if(result1.equals(result2))
			return true;
		else
			return false;
		
	}

}

