package com.demo;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {


        int randomNum= (int)(Math.random()*100) +1;
        System.out.println(randomNum);
        int guess=0, attempt=0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println(" Please enter a number 0 to 100");
            guess= sc.nextInt();
            attempt=attempt+1;
            if(guess>randomNum)
                System.out.println("Sorry! it's too high");
            else if(guess<randomNum)
                System.out.println("Sorry ! it's too low");
            else
                System.out.println("Congratulation! it's correct in "+ attempt +" attempts");
        }while (randomNum!=guess);
    }
}
