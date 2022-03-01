package com.geekster.stringclasspractice;

public class StringPractice {

	public static void main(String[] args) {

        //Display Initials
		//Validation - String empty
		//Initials = upper case
		String fullName = "Divya Motiwala";
		String[] words = fullName.split(" ");
		for(String w : words)
			System.out.print(w.charAt(0) + " ");
				
		
		//Capital Method
		
		String output = "";
		String input = "this is geekster";
		String[] inputWords = input.split(" ");
		for(int i=0; i< inputWords.length;i++)
		{
			String w = inputWords[i];
			
			String firstLetter = w.substring(0,1);
			String remainingWord = w.substring(1);
			output = output+ firstLetter.toUpperCase() + remainingWord + " ";
		}
		System.out.println(output);
		
    }

}


