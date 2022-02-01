package com.demo;


public class Demo {
    // how to declare string
    //1. --> String literal
    String name= "Neeraj";

    // 2. -- > using new Keyword
    String myName= new String("Neeraj");

    public static void main(String[] args) throws Exception{
        // concatenation of string;
        // adding/joining two strings
        String name = "Neeraj";
        String myName="Neeraj";
        String name1= new String("Neeraj");
        String myName1 = new  String("Neeraj");
       /* System.out.println(name == myName); // true
        System.out.println(name1 == myName1);*/
        // == checks the address of values in heap

        // compareTo()
        // +, - or 0 vales --> "+" --> when str1 > str2 ; "-" --> when str1< str2 --> str1==str2 ;
        //System.out.println(name.compareTo(myName));
        // length;
        //System.out.println(name.length());

        // to compare to strings--> equals()
       /* boolean isSame= name.equals(myName);
        System.out.println(isSame);

        boolean isSame1= name1.equals(myName1);
        System.out.println(isSame1);*/

        // to find a character at a particular index -->  charAt(index)
       /* System.out.println( name.charAt(5));*/

        // To iterate through strings --
        String myAddress = "New Delhi, India";
        String yourAddree= "New York";
        char ad = myAddress.charAt(0);
        char add = yourAddree.charAt(0);
        System.out.println(ad == add);

       /* System.out.println("No. of characters =" + myAddress.length());
        for(int i=0; i<myAddress.length();i++){
            System.out.println(myAddress.charAt(i));
        }*/
    }
}
