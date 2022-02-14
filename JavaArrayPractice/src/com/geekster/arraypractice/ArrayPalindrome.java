package com.geekster.arraypractice;

public class ArrayPalindrome {
	
	public static void main(String[] args)
	{
		String[] word1 = {"abc", "def"};
		int flag = 0;
		for(int i = 0; i< word1.length; i++)
		{
			if(isPalindrome(word1[i]))
			{
				flag =1;
				System.out.println(word1[i] + " is a Palindrome");
				break;
			}
			
			
		}
		if(flag == 0)
			System.out.println("No Palindrome");
	}

	/*
	 * Input = array
	 * 1.) Traverse the array => for loop
	 * 2.) Check the array element - palindrome or not
	 * 3.) If it is palindrome , return string,
	 * 4.) else return empty string
	 */
	
	private static boolean isPalindrome(String str)
	{
		boolean isPalindrome = true;
		for(int i = 0;i< str.length()/2; i++)
		{
			if(str.charAt(i) != str.charAt(str.length()-i-1))
			{
				isPalindrome = false;
				break;
			}

		}
		return isPalindrome;
			
	}
}

