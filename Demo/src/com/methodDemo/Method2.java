package com.methodDemo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Method2 {

    public static void main(String[] args) {
        Integer[] arr = {2,2,4,4,5,5,5,7,8,8,8,8};
        int frequency =0;
        int heighestRepeatingElement=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int a :arr){
            if(map.containsKey(a))
                map.put(a, map.get(a)+1);
            else
                map.put(a,1);
            if(frequency<map.get(a)){
                frequency=map.get(a);
                heighestRepeatingElement= a;
            }
        }
        System.out.println("Heighest repeating elemenet = " +heighestRepeatingElement);
        System.out.println("Frequency = "+frequency);

        System.out.println("************Using Stream API*******************8");
        Map<Integer, Long> result2 = new LinkedHashMap<>();
      Arrays.asList(arr).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                      .entrySet()
                      .stream()
                              .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                      .forEachOrdered(x -> result2.put(x.getKey(),x.getValue()));

        System.out.println(result2.entrySet().iterator().next().getKey() +" --> "+ result2.entrySet().iterator().next().getValue());

        SingletonObject ob = SingletonObject.getInstance();
        ob.show();

    }
}
