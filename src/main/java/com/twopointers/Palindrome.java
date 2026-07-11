package com.twopointers;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("Is Palindrome : "+isPalindrome("jalaj"));
        System.out.println("Is Palindrome : "+isPalindrome("radar"));
        System.out.println("Is Palindrome : "+isPalindrome("hello"));

        System.out.println("Is Palindrome : "+isPalindromeUsingStringBuilder("radar"));
        System.out.println("Is Palindrome : "+isPalindromeUsingStringBuilder("hello"));
    }

    private static boolean isPalindrome(String str){

        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length-1;

        while(left < right){
            if(charArray[left] != charArray[right]){
              return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindromeUsingStringBuilder(String s){

        StringBuilder sb = new StringBuilder(s);
        String reverseString = sb.reverse().toString();
        return s.equals(reverseString);
    }
}
