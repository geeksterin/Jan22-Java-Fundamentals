package com.array;

import java.util.Scanner;

public class ArraySizeWithUserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array you want to create :");
        int size = sc.nextInt();

        //create the array
        int[] id= new int[size];

        for(int index=0;index<id.length;index++){
            System.out.println(id[index]);
        }
    }
}
