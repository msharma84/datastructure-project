package com.hashmap;

import java.util.*;

public class SortMapExample {

    public static void main(String[] args) {

        Map<Integer, String> unsortMap = new HashMap<>();
        unsortMap.put(10, "Ashraf");
        unsortMap.put(5, "Sara");
        unsortMap.put(6, "Mohamed");
        unsortMap.put(20, "Esraa");
        unsortMap.put(1, "Bahaa");
        unsortMap.put(7, "Dalia");
        unsortMap.put(8, "Amira");
        unsortMap.put(99, "Ahmed");
        unsortMap.put(50, "Sama");
        unsortMap.put(2, "Nada");
        unsortMap.put(9, "Osama");

        System.out.println("Un sorted Map ->");
        descMap(unsortMap);

        System.out.println("\nSorted Map in ascending order......");
        Map<Integer, String> ascSortMap = new TreeMap<>(unsortMap);
        descMap(ascSortMap);

        System.out.println("\nSorted Map in descending order......");
        Map<Integer, String> descSortMap = new TreeMap<>(Comparator.reverseOrder());
        descSortMap.putAll(unsortMap);
        descMap(descSortMap);
    }

    public static void descMap(Map<Integer, String> map){
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }
    }
}
