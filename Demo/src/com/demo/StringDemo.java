package com.demo;

public class StringDemo {


    public static void main(String[] args) {
        //int a =5;
        // "My name is Neeraj" // text
        // string
        // datatype -- > Primitive --> int , float, double  / Non primitive ---> Class type/ object

        // string declaration : 2 ways
        // 1. string literal
        String message = "My name is Neeraj";
        // 2. using new keyword
        String message1 = new String("Ny name is Neeraj");

        // in builts provided by String class
        // 1. equals
        message.equals(message1); // compares to strings

        //2. compareTo
        message.compareTo(message1); // if -: message < message1 ; + : message > message1 ; 0 message = message;

        // 3. length() --> size of string
        message.length();

        // 4. charAt(index); --> tells you the charater at position index
        message.charAt(5);

    }

}
