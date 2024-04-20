package com.leetcode;

public class LengthOfLastWord {

	public static void main(String[] args) {
		
		String s = "Hello World";
		
		String [] split = s.trim().split(" ");
		int lastWordIndex = split.length -1;
		int lastWordLength =  split[lastWordIndex].length();
		System.out.println(lastWordLength);
		
	}

}
