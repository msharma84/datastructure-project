package stringManipulation;


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
        Optional<Map.Entry<Character,Integer>> value = myMap.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst();
        if(value.isPresent())
            System.out.println("First Non repeated character - "+value.get().getKey());
    }
}
