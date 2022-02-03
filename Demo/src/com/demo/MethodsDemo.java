package com.demo;

import java.util.Scanner;

public class MethodsDemo {

    public static void main(String[] args) {
        // method calling
        int greater = greaterNumber(5, 7, 2);
        System.out.println(greater);

        // calling again with different parameter
        int greater1 = greaterNumber(100, 70, 20);
        System.out.println(greater1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1 number :");
        int a = sc.nextInt();

        //Scanner sc1 = new Scanner(System.in);
        System.out.println("Please enter 2 number :");
        int a1 = sc.nextInt();

        //Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter 3 number :");
        int a2 = sc.nextInt();

        printGreaterNumber(a, a1, a2);

    }

   /*
   Method declaration
    1. modifiers --> access modifiers : Public, Private, Protected, default
    2. return type --> data type of output : int, float, long, String, void
    3. method name ---> name given to a method : it will be a single name
    4. parameters/arguments ---> data which is passed in a method : 0 - N arguments

   */
     /* a, b ---> {
        sout (a + b)
         return a + b; // method body
      }
      */

    // create a method which accepts 3 parameters and return a number which is greater

    private static int greaterNumber( int num1, int num2, int num3){
        if(num1>num2){
            if(num1>num3){
                return num1;
            }
            else{
                return num3;
            }
        }
        else{
            if(num2>num3){
                return num2;
            }
            else{
                return num3;
            }
        }
    }

    private static void printGreaterNumber(int num1, int num2, int num3){
        if(num1>num2){
            if(num1>num3){
                System.out.println(num1);
            }
            else{
                System.out.println(num3);
            }
        }
        else{
            if(num2>num3){
                System.out.println(num2);
            }
            else{
                System.out.println(num3);
            }
        }
    }
}
