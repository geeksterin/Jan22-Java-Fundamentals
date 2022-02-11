package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {

        // Create an array
        /* 1. Declare an array  ----> How ??? ---> datatype + [] + variable   eg. int [] id
        *  2. Initialize an array ----> How ?? ----> new datatype +[ size of the array ] eg. new int [5]
        *   3. Insert elements
        * */

        /*//1.
        int[] rollNumbers;
        //2.
        rollNumbers = new int [10];
        //3.
        rollNumbers = {1,2,3,4,5,6,7,8,9,10};*/

        // collection of Integers
        int[] rollNumbers = new int[10];

        //collection of string
        String[] name = new String[10];
        System.out.println(name.getClass().getName());

        // Traversing & Insertion of elements/data in array

        //default values
        for(int i=0;i<10; i++){
            System.out.println("Roll No. :"+rollNumbers[i]);
            System.out.println("Name " + name[i]);
        }

        //Insert element in rollnumbers array
      /*  int roll=1;
        int index=0;
        while (index<10){
            rollNumbers[index]= roll;
            index++;
            roll++;
        }
        for(int i=0;i<rollNumbers.length; i++){
            System.out.println("Roll No. :"+rollNumbers[i]);
        }*/

        // Take user input as name and insert to array called name;
        Scanner sc= new Scanner(System.in);
        for (int n=0; n<name.length;n++){
            System.out.println("Enter student name "+ (n+1));
            name[n]=sc.nextLine();
        }
        //Printing students name
        for(int i=0;i<name.length; i++){
            System.out.println("Name of Student "+ (i+1)+" "+ name[i]);
        }
    }
}
