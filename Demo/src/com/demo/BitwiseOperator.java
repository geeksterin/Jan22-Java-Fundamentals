package com.demo;

import java.util.Scanner;

public class BitwiseOperator {

    // bitwise operator --> The operators which works on bits;

    public static void main(String[] args) {
        // & --> Bitwise AND operator
        // 0 & 0 --> 0; 0 & 1 --> 0; 1 & 0 --> 0; 1 & 1 --> 1

        /*int a = 2; // 0 0 1 0
        int b = 3; // 0 0 1 1
         int c = a & b; // 0 0 1 0 = 2
        System.out.println(c);*/

       /* int a = 25;  // 1 1 0 0 1
        int b= 15;  // 0 1 1 1 1
        int c = a & b; // 0 1 0 0 1 = 9
        System.out.println(c);
*/

        // | --> Bitwise Or operator
        // 0 | 0 --> 0; 0 | 1 --> 1; 1 | 0 --> 1; 1 | 1 --> 1

      /*  int a = 2; // 0 0 1 0
        int b = 3; // 0 0 1 1
        int c = a | b; // 0 0 1 1 = 3
        System.out.println(c);

        int a1 = 25;  // 1 1 0 0 1
        int b1= 15;  // 0 1 1 1 1
        int c1 = a1 | b1; // 1 1 1 1 1 = 31
        System.out.println(c1);*/


        // << --> Left shift ; >> --> Right Shift
        /* int a = 8;      // 1 0 0 0
         int b = a << 2; // 1 0 0 0 0 0 = 32
         System.out.println(b);
*/
       /* int a = 7; // 0 1 1 1
        int b = a << 1; // 0 1 1 1 0 = 14
        System.out.println(b);*/

        //  >> --> Right Shift
       /* int a = 25; // 1 1 0 0 1
        int b = a >> 2; // 1 1 0 = 6;
        System.out.println(b);*/

       /* int a = 8; // 1 0 0 0
        int b= a >> 1; // 1 0 0 = 4
        System.out.println(b);*/

        // unary bitwise not
      /*  int a = 25; // 1 1 0 0 1
        //0 0 1 1 0
        System.out.println(~a);*/

        // XOR -->  AND + OR

        // Check even or odd number entered by user

       /* Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();
        String isEven= "";*/

       /* if(input % 2 == 0){
            isEven = true;
        }
        else {
            isEven= false;
        }*/
        // Using ternary operator
       /* isEven = input % 2 == 0 ?  "Even" : "Not Even";
        System.out.println(isEven);*/

        int  greater;
        int a = 500, b= 70, c= 40;
        greater = a>b? a>c ? a : c : b>c ? b :c;
        System.out.println(greater);



    }


}
