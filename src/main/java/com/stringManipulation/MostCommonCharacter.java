package com.stringManipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MostCommonCharacter {

    public static void main(String[] args) {

        String str = "swiss";
        Map<Character,Integer> characterIntegerMap = new HashMap<>();
        for(char ch : str.toCharArray()){
            characterIntegerMap.put(ch,characterIntegerMap.getOrDefault(ch,0)+1);
        }

       Optional<Map.Entry<Character,Integer>> mostCommonCharacter = characterIntegerMap.entrySet()
                .stream().max(Map.Entry.comparingByValue());

        mostCommonCharacter.ifPresent(characterIntegerEntry -> System.out.println("Highest occurrence of character - "
                + characterIntegerEntry.getKey()
                + " with occurrence count - " + characterIntegerEntry.getValue()));
    }
}
