package stringManipulation;

import java.util.Arrays;

public class RemoveSpaces {

    public static void main(String[] args) {

        String str = "   This will be going    ";

        System.out.println(str.trim());

        String [] subStr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < subStr.length; i++){
            if(subStr[i] != ""){
               sb.append(subStr[i] + " ");
            }
        }
        System.out.println(sb.toString());
    }
}
