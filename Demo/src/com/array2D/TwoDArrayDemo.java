package com.array2D;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayDemo {

    public static void main(String[] args) {
      /*  // Create 2D array

        // 1. declare the array --> datatype + []+[]+ variable name
        // 2. Instantiating of array --> 'new' + data type +[row size] + [column size]
        //3. inserting values.

        int [][] array2D = new int [5][3];
        //Arrays.toString(array2D); // 1D Array
        System.out.println(Arrays.deepToString(array2D));
        // empty values/ assigned values = 0 in memory
        int [][] arr2D = new int [][]{ {1,23,34},  {76,89,0},  {23,78,01},  {23,23,65,78},  {7,4,7,19} };
        //int [][] arr2D = {  {1,23,34},  {76,89,0},   {23,78,01},  {23,23,65,78},  {7,4,7,19}  };
        System.out.println(Arrays.deepToString(arr2D));
        // we can cannot update since this index position is empty -- Ref line 19
        //arr2D[0][3]=100;
       // System.out.println("Unentered values "+ arr2D[0][3]);*/

        //createArrayByUserInput();
        int [][] arr2D = new int [][]{ {1,23,34},  {76,89,0},  {23,78,01},  {23,23,65},  {7,4,7} };
        int[][] squareMatrix = new int [][]{ {1,23,34},  {76,89,0},  {23,78,01} };

        //traverseArray(arr2D);

        // How to find number of elements in a two-D array = rows * columns

        //primary diagonal elements
        diagonalElements(arr2D);

        // for secondary diagonal elements
        //secondaryDigonalElements(squareMatrix);

    }

    public static void createArrayByUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter row size");
        int row = sc.nextInt();
        System.out.println("Please enter column size");
        int col = sc.nextInt();

        // row count or column count = index + 1;

        // declare array
        int[][] userArray = new int[row][col];
        // iteration of rows
        for(int r=0;r<row;r++){
            System.out.println("Please enter values for row :"+ (r+1));
            // iteration for columns
            for(int c=0;c<col;c++){
                System.out.println("Please enter vale of column :"+(c+1));
                userArray[r][c]= sc.nextInt();
            }
        }
        System.out.println("Created matrix : "+ Arrays.deepToString(userArray));

        // put value at column 2 and row 3
        userArray[2][1]= 100;
        System.out.println("Updated matrix : "+ Arrays.deepToString(userArray));
    }

    private static void traverseArray(int[][] array2D){
        // loop for row counts
        for(int row=0; row< array2D.length;row++){
            System.out.println("Row :"+ (row+1));
            // loop for columns
            for(int col=0;col< array2D[row].length;col++){
                // each row and eeach column can be accessed.
                System.out.print("Column : "+(col+1)+", ");
            }
            System.out.println();
        }
    }

    private static void diagonalElements(int[][] array2D){
        boolean isSquare = isSquare(array2D);
        if(isSquare == false){
            System.out.println("It is a rectangular matrix, we can not find diagonal elements");
        }
        else{
            System.out.println("Diagonal elements are :");
            for(int row=0;row<array2D.length;row++){
                for (int col=0; col<array2D[row].length; col++){
                    if(row == col){
                        System.out.print(array2D[row][col]+",");
                    }
                }
            }
        }
    }
    private static boolean isSquare(int [][] array2D){
        boolean isSquare = false;
        if(isSquare == false){
            for(int row=0;row<array2D.length;row++) {
                if (array2D.length != array2D[row].length) {
                    isSquare=false;
                    break;
                }
                else{
                    isSquare= true;
                }
            }
        }
        return isSquare;
    }

    private static void secondaryDigonalElements(int[][] array2D){
        System.out.println("Secondary Diagonal elements are :");
        for(int row=0;row<array2D.length;row++){
            for (int col=0; col<array2D[row].length; col++){
                if( (row+col) == (array2D.length-1) ){
                    System.out.print(array2D[row][col]+",");
                }
            }
        }
    }

}
