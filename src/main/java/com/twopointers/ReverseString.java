package com.twopointers;

public class ReverseString {

    public static void main(String[] args) {

        String str = "java";
        char [] ch = str.toCharArray();
        int length = ch.length;
        int right = length-1;

        for(int left =0 ; left < length/2; left++,right--){
            char c = ch[left];
            ch[left] = ch[right];
            ch[right] = c;
        }
        String reverse =  new String(ch);
        System.out.println(reverse);
    }
}
