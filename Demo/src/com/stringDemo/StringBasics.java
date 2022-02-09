package com.stringDemo;

public class StringBasics {

    public static void main(String[] args) {
       /* // String literal
        String s1= "Geekster";
        String s2= "Geekster";

        if(s1==s2)
            System.out.println("one object will be created");
        else
            System.out.println("Two object will be created");
        s1=s1+" class";

        if(s1==s2)
            System.out.println("one object will be created");
        else
            System.out.println("Two object will be created");*/


       /* // 3 objects
        String s3= new String("Geekster");
        String s4= new String("Geekster");

*/
       /* long startTime = System.currentTimeMillis();
        int i=0;
        while(i< 10000000){
            String name ="Neeraj";
            i++;
        }
        long endTime = System.currentTimeMillis();

        System.out.println(" Time taken using string literal : "+ (endTime-startTime));

        long startTime1 = System.currentTimeMillis();
        int j=0;
        while(j< 10000000){
            String name = new String("Neeraj");
            j++;
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println(" Time taken using new Keyword : "+ (endTime1-startTime1));*/
    }
}
