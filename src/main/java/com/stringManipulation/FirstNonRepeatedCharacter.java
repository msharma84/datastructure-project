package com.stringManipulation;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String str = "swiss";
        Map<Character,Integer> myMap = new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            myMap.put(ch,myMap.getOrDefault(ch,0)+1);
        }
        Optional<Map.Entry<Character,Integer>> value = myMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst();
        value.ifPresent(characterIntegerEntry ->
                System.out.println("First Non repeated character - " + characterIntegerEntry.getKey()));
    }
}
