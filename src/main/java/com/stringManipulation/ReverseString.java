package com.stringManipulation;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Hello";

        char [] ch = str.toCharArray();
        char temp;
        int leftIndex = 0;
        int len = ch.length-1;
        while(leftIndex <= len){
            temp = ch[leftIndex];
            ch[leftIndex] = ch[len];
            ch[len] = temp;
            len--;
            leftIndex++;
        }
        System.out.println("By Brute Force - "+new String(ch));
        System.out.println("By StringBuilder reverse - "+new StringBuilder(str).reverse());
    }
}
