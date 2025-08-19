package stringManipulation;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {

    public static void main(String[] args) {

        String str = "aabbcdd";

        Set<Character> uniqueSet = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(uniqueSet.add(ch)){
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}
