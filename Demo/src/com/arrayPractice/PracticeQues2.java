package com.arrayPractice;

public class PracticeQues2 {

    public static void main(String[] args) {
        /*
        There are 2 int type array data type. One is containing 50 elements,
	    and another one is containing 30 elements.
	    Can we assign the array of 50 elements to an array of 30 elements?
         */
        int[] ar1 = new int[50];
        int[] ar2 = new int[30];
        // it will resize the array : ar2 will get size of ar1;
        ar2=ar1;
        int val = ar2[29];
        int val1 = ar2[49];
        System.out.println(val1 );

        int A[] = {1,2,3,4,5,7};
        int missingNumber =missingNumber(A, 7);
        System.out.println("Missing number in the array "+ missingNumber);

    }

    public static int max(int[] array){
        /*
         Find the largest number in an array : {1,5,8,89,60}
        *
        * */
        return 0;
    }
    public static int min(int[] array){
        /*
         Find the smallest number in an array : {1,5,8,89,60}
        *
        * */
        return 0;
    }

    public static int findFrequency(int [] array, int elem){
        /*
        * Find the frequency of an element in an array --> {2,4,5,6,2,2,6,7}: frequency of 2 = 3
        * */

        return 0;
    }

    public static int missingNumber(int [] arr, int len){
        /*
        Given an array of size N such that it
        only contains distinct integers in the range of 5 to N. Find the missing element.
        Input:
	    N = 5
	    A[] = {1,2,3,5}
	    Output: 4
         */

        // sum of N ---> no of terms * (number of terms + 1)/ 2 = 1 -10 = 10 * (10+1)/2 = 10 * 11/2 = 55
        // no of terms * (firstNumber+lastNumber)/2

        int totalSum = len * (len+1)/2 ;
        int sumOfArrayElements=0;
        for(int elem :arr){
            sumOfArrayElements+=elem;
        }
        int missingNumber = totalSum - sumOfArrayElements;

        return missingNumber;
    }
}
