package com.leetcode;

public class Palimdrome {

	public boolean isPalimdrome(int val) {
		
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
		
		Palimdrome pal = new Palimdrome();
		System.out.println("is Palimdrome - "+pal.isPalimdrome(1011));
	}
}
