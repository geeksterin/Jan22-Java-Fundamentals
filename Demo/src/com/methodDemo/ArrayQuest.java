package com.methodDemo;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayQuest {

    public static void main(String[] args) {
       /* int[] nums = { 3, 4, -7, 1, 3, 3, 1, -4 };
        int target = 7;

        for(int i =0;i<nums.length;i++){
            int sum =0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum == target){
                    System.out.println(IntStream.rangeClosed(i,j).mapToObj(k->nums[k]).collect(Collectors.toList()));

                }
            }
        }*/
        String name = "Neeraaj";
        Map<String,Long> map = new LinkedHashMap<>();
        Arrays.asList(name.split("")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x-> map.put(x.getKey(), x.getValue()) );
        System.out.println(map);

       /* String[] array = {"A","B","C","D","E"};

        Object[] ob=IntStream.rangeClosed(1, array.length).mapToObj(i->array[array.length-i]).toArray();

        //Collections.reverse(Arrays.asList(arr));
        System.out.println(ob[0]);
        //System.out.println(Array.get(array,0));

        //String name1="Neeraj";

        IntStream.rangeClosed(1,name.split("").length).mapToObj(i->name.split("")[name.split("").length-i])
                .collect(Collectors.toList()).forEach(e-> System.out.println(e));*/

        String [] s= {"A","B","C","D","E"};
       /* for(int i=0; i<s.length/2;i++){
            String temp= s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=temp;
        }
        System.out.println(s[0]);*/

        Map<String, Integer> m = new HashMap<>();
        m.put("Name", 2);
        m.put("Name1", 3);
        m.put("Name2", 20);
        m.put("Name3", 30);
        m.put("Name4", 1);
        m.put("Name5", 5);

        List<Map.Entry<String,Integer>> l = new ArrayList<>(m.entrySet());

        Collections.sort(l, new Comparator<Map.Entry<String,Integer>>(){
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String,Integer> o2){
                return o1.getValue() - o2.getValue();
            }
        });
        System.out.println(l);

       /* Collections.sort(l, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return 0;
            }
        });*/


    }
}
