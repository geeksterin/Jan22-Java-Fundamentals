package com.demo;

public class Xor {

    // XOR --> Exclusive OR
    public static void main(String[] args) {

        // XOR :  1 1 --> 0, 0 0 --> 0, 0 1 --> 1, 1 0 --> 1

       /* int a = 2;  // 0 0 1 0
        int b = 3;  // 0 0 1 1
        int c = a^b; // 0 0 0 1 ---> 1
        System.out.println(c);*/

        /*int a1= 25;    // 1 1 0 0 1
        int b1= 15;    // 0 1 1 1 1
        int c1 = a1^b1; // 1 0 1 1 0 ---> 22
        System.out.println(c1);*/

       /* // The XOR of a number with itself is Zero
        int a2 = 8;
        int b2 = a2^a2;
        System.out.println(b2);
        // The XOR of a number with 0 = number itself
        int a3 = 8;
        int b3 = a3^0;
        System.out.println(b3);*/

       /* int a4 = 15; // 0 1 1 1 1
        int b4 = 25; // 1 1 0 0 1
        a4 = a4^b4;  // 1 0 1 1 0 ---> 22
        b4 = a4^b4; //  0 1 1 1 1 ---> 15
        a4 = a4^b4; //  1  1 0 0 1 ---> 25
        System.out.println( "a4 ="+ a4 + "b4 = "+ b4);*/

        // Find count of 1 & 0 in a number of its binary format for integers
        // 15 = 0 1 1 1 1 : count of 1 = 4, count of 0 = (bits in integers - count of 1 ) = 32 - 4 = 28
        int num = 15, count1 =0;
        /*while(num>0){
            if(num % 2 == 1){
                count1 ++;
            }
            num =num/2;
        }*/
        // 15 = 0 1 1 1 1 --- using bitwise operator >>
        // 15 = 0   1 1 1    &  0 0 0 0 1 =  0 0 0 0 1

        while (num > 0){
            count1+= num & 1;
            num >>= 1;
        }
        int count0 = 32 - count1;
        System.out.println("count of 1 = " +count1 + " count 0 = "+ count0);






    }
}
