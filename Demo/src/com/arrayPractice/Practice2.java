package com.arrayPractice;

import java.util.Arrays;

public class Practice2 {

    public static void main(String[] args) {
        // Eg.  [1, 3, 7, 8, 7, 2] ---> 12
        System.out.println(" Using Brute force approach ");
        // 1. Brute force approach
        int [] arr= {1, 3, 7, 8, 7, 2};
        boolean isTrue = sumUsingBruteForce(arr, 11);
        System.out.println("Target elem = 11:" +isTrue);
        boolean isTrue1 =sumUsingBruteForce(arr, 12);
        System.out.println("Target elem = 12 :" + isTrue1);

        // Two pointer approach
        System.out.println(" Using Two pointer approach ");
        boolean isTrue2 = sumUsingTwoPointerApproach(new int[]{1, 3, 7, 8, 7, 2}, 11);
        System.out.println("Target elem = 11:" +isTrue2);
        boolean isTrue3 =sumUsingTwoPointerApproach(new int[] {1, 3, 7, 8, 7, 2}, 12);
        System.out.println("Target elem = 12 :" + isTrue3);

        // Anonymous Array in Java --> when array does not have any reference .

        copyArray(arr);

        // Get the sum of arrays :
        int [] firstArray = {10, 20, 30, 40, 50};
        int [] secondArray= {9, 18, 27, 36};
        int[] finalArray = sumOfTwoArrays(firstArray,secondArray);
        System.out.println("Array of addition :" + Arrays.toString(finalArray));

        // Find duplicate elements
        int[] withDuplicates = { 1, 2, 3, 1, 2, 3, 4, 5, 3, 6 };
        findDuplicateElements(withDuplicates);

    }

    public static boolean sumUsingBruteForce(int[] array, int targetElem){
        boolean SumOfPairElem= false;
        for(int i=0;i<array.length;i++){
            for(int j = i+1; j<array.length;j++){
                if(array[i]+array[j]==targetElem)
                    SumOfPairElem= true;
            }
        }
        return SumOfPairElem;
    }

    public  static  boolean sumUsingTwoPointerApproach(int[] array, int targetElem){
        boolean SumOfPairElem= false;
        // Arrays.sort() uses quick sort algorithm for sorting --> n(log n) --> Big O notation -- O (n(log n))
        Arrays.sort(array);
        int i =0, j= array.length-1;
        while (i != j){
            int sum = array[i] + array[j];
            if(sum == targetElem){
                SumOfPairElem =true;
                break;
            }
            else if(sum < targetElem){
                i++;
            }
            else {
                j--;
            }
        }
        return  SumOfPairElem;
    }

    private static int[] copyArray(int[] array){
        int[] array1 = new int [array.length];

       // Copying elements Using for loop
        for(int i=0;i<array.length;i++)
        {
            array1[i]= array[i];
        }
       /* // Copying element using clone().
         array1= array.clone();

        // Copying array using arrayCopy() method
        System.arraycopy(array,0, array1, 0, array.length);*/

         /*array1[0]++;
        System.out.println("Initial array " + Arrays.toString(array));
        System.out.println("manipulated array "+ Arrays.toString(array1));*/
         return array1;

    }

    private static int[] sumOfTwoArrays(int [] ar1, int[] ar2){

        /*
          first array: = {10, 20, 30, 40, 50};
          second array: {9, 18, 27, 36, 45};
          sum of array: = {10+9, 20+18, 30+27, 40+36, 50+45};

          first array: [2, 4, 6]
          second array: [2, 3, 5, 7]
          sum of array: [4, 7, 11]

         */
        int finalLength = ar1.length < ar2.length ? ar1.length : ar2.length;
        int [] sumOfArray = new int[finalLength];
        for (int i =0; i<finalLength;i++){
            sumOfArray[i]= ar1[i] +ar2[i];
        }
        return sumOfArray;
    }

    public  static void findDuplicateElements(int[] array){
        /*
        * Find duplicate elements in array and print it
            int[] withDuplicates = { 1, 2, 3, 1, 2, 3, 4, 5, 3, 6 };
	        String[] myArray = { "ab", "cd", "ab", "de", "cd" };
        * */
        for( int i=0;i<array.length;i++){
            for( int j=i+1; j<array.length;j++){
                if(array[i] == array[j] && i !=j )
                    System.out.print(array[i] +",");
            }
        }
    }
}
