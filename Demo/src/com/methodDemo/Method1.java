package com.methodDemo;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Method1 {
    public static void main(String[] args) {
       /* HashMap<Integer,String> con = new HashMap<>();
        con.put(1, "Neeraj");
        con.put(2,"Srivastava");
        con.put(3,"Nice man");
        System.out.println(con.get(2));
        Iterator<Integer> itr= con.keySet().iterator();
        synchronized (con){
            while (itr.hasNext()){
                System.out.println(con.get(itr.next()));
            }
        }
        con.forEach((k,v)->{
            System.out.println("Key: "+ k + " value: "+v);
        });
        System.out.println(con.values());

        System.out.println("*************Using Concurrent Hash map******************");

        ConcurrentHashMap<Integer,String> con1 = new ConcurrentHashMap<>(con);

        Iterator<Integer> itr1= con1.keySet().iterator();
        synchronized (con1){
            while (itr1.hasNext()){
                System.out.println(con1.get(itr1.next()));
            }
        }
        con1.forEach((k,v)->{
            System.out.println("Key: "+ k + " value: "+v);
        });
        System.out.println(con1.values());
*/

        Integer[] ar = {10,11,13,14,15};
        // sum of numbers between first & last term = n * (f + l)/2;
        int f = 10, l =15;
        int n = (l -f) + 1; // ( 8 - 5 ) +1 = 4
        int sum = n * (f + l)/2;

        int sum1= Arrays.stream(ar).reduce(0,(a,b)->a+b);
        System.out.println(sum - sum1);


        System.out.println(Arrays.stream(ar).sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst());



    }
}
