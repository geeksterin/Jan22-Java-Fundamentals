package com.stringDemo;

public class StringIntern {

    public static void main(String[] args) {
        String name ="Neeraj Srivastava";
        String name1 = new String("Neeraj Srivastava");

        //name.equals(name1); // true

        boolean isTrue= name == name1;
        System.out.println(isTrue);
         name1.intern();
        //boolean isTrue1 = name == name1.intern();
        System.out.println(name == name1);


    }
}
