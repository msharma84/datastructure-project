package com.stringManipulation;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrenceCount {

    public static void main(String[] args) {
        String str = "Hello World".replaceAll("\\s","");
        Map<Character,Integer> myMap = new HashMap<>();
        /*for(char ch : str.toCharArray()){
            if(!myMap.containsKey(ch)){
                myMap.put(ch,0);
            }
            myMap.put(ch,myMap.get(ch)+1);
        }*/
        for(char ch : str.toCharArray()){
            myMap.put(ch,myMap.getOrDefault(ch,0)+1);
        }
        System.out.println(myMap);
    }
}
