package com.arrayPractice;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

       /*
       How to compare Two Arrays?
            int [] num1 = { 1, 2, 3 };
            int[] num2 = { 4, 5, 6 };
       */
        int [] num1 = { 1, 2, 3 };
        int[] num2 = { 4, 5, 6 };
        boolean isEqual = compareArray(num1,num2);
        System.out.println(isEqual);

        int [] num3 = { 1, 2, 3 };
        int[] num4 = { 1, 2, 3 };
        boolean isEqual1 = compareArray(num3,num4);
        System.out.println(isEqual1);


        // comparing array using inbuilt methods;
        System.out.println(" comparing using inbuilt method :" +  Arrays.equals(num1,num2));
        System.out.println(" comparing using inbuilt method :" +  Arrays.equals(num3,num4));
        // comparison operator will not work
        System.out.println(" comparing using comparison operator :" +  (num3 == num4));

    }

    public static boolean compareArray(int[] ar1, int[] ar2){
        boolean isEqual = true;
        if( ar1.length != ar2.length){
            isEqual= false;
        }
        else{
            for(int i=0; i<ar1.length;i++){
                isEqual = ar1[i] == ar2[i];
            }
        }
        return isEqual;
    }
}
