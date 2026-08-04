package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasicExample {

    public static void main(String[] args) {

        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);
        ages.put(null, 0);

       /* ages.forEach((key,value) ->{
            System.out.println(key + " : " + value);
        });*/

        System.out.println("Alice age :" + ages.get("Alice"));
        System.out.println("Eve age :"+ages.get("Eve"));

        if(ages.containsKey("Bob")){
            System.out.println("Bob is in the map.");
        }
        if(ages.containsValue(35)){
            System.out.println("Someone is 35 years old.");
        }
        ages.remove(null);
        for(Map.Entry<String,Integer> entry: ages.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }

        String[] words = { "apple", "banana", "apple", "orange", "banana", "apple" };
        Map<String,Integer> count = new HashMap<>();

        for(String w : words){
            count.merge(w,1,Integer::sum);
        }
        System.out.println(count);
    }
}
