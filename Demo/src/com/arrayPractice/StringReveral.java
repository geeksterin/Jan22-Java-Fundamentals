package com.arrayPractice;

import java.util.Arrays;

public class StringReveral {

    public static void main(String[] args) {
        String[] name ={"Jack", "John", "Jim", "Jocky", "Jiya"};

        // reverse the array in an optimised  way

        for(int i =0; i<name.length/2;i++){
            String tempName = name[i];
            name[i] = name[name.length-i-1];
            name[name.length-i-1] = tempName;
        }
        System.out.println(Arrays.toString(name));

    }
}
