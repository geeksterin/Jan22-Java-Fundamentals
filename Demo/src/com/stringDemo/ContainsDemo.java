package com.stringDemo;

public class ContainsDemo {

    public static void main(String[] args) {
        String message= "Hi Geeks! How are you doing?";
        String email= "nrjsrivastav100@yahoo.com";

        boolean isCorrect = email.contains(".com");
        boolean isAvailable = message.contains("Hello");

        System.out.println(isCorrect);
        System.out.println(isAvailable);

        // replace method to manipulate the values in strings
        message = message.replace("Hi", "Hello");
        System.out.println(message);

    }
}
