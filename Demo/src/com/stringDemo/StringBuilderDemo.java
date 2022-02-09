package com.stringDemo;

import java.util.*;
import java.util.stream.IntStream;

public class StringBuilderDemo {

    public static void main(String[] args) {
       /* Scanner s =new Scanner(System.in);
        String input = s.nextLine();

        StringBuilder s1 = new StringBuilder();
        s1.append(input);
        System.out.println("String entered by user :"+ s1);*/

        StringBuilder sb= new StringBuilder();
        // append;
        sb.append("Geekster");
        sb.append(" Geekster");
        sb.append(" classes");
        sb.append(" score good ");
        System.out.println(sb);

        //Reverse
        sb.reverse();
        //replace
       sb.replace(0,17, "Geeks");
        System.out.println(sb);




    }
}
