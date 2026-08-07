package com.leetcode;

public class Palindrome {

	public boolean isPalindrome(int val) {
		
		if(val<0) {
			return false;
		}
		int temp = val;
		int reversed=0;

		while(temp != 0) {
			int singleDigit = temp%10;
			reversed = reversed * 10 + singleDigit;
			temp = temp/10;
		}
		return (reversed == val) ;
	}
	public static void main (String...args) {

		Palindrome pal = new Palindrome();
		System.out.println("is Palindrome - "+pal.isPalindrome(101));
	}
}
