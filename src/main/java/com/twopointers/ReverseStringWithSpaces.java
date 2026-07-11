package com.twopointers;

public class ReverseStringWithSpaces {

    public static void main(String[] args) {

        String str = "Java is amazing";
        String [] strArray = str.split(" ");
        for(String s : strArray){
           char [] ch = s.toCharArray();
           int chLength = ch.length;
           int right = chLength-1;
           for(int left = 0; left < chLength/2; left++,right--){
               char c = ch[left];
               ch[left] = ch[right];
               ch[right] = c;
           }
           String reverse = new String(ch);
           System.out.println(reverse);
        }
    }
}
