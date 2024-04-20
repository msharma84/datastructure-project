package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Roman2Integer {

	public int romanToInt(String romanString) {
		
		int answer = 0;
		Map<Character,Integer> romanMap = new HashMap<Character, Integer>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		int length = romanString.length();
		
		for(int i =0 ; i < length; i++ ) {
			if(i < romanString.length()-1 && romanMap.get(romanString.charAt(i)) < romanMap.get(romanString.charAt(i + 1))) {
				answer = answer - romanMap.get(romanString.charAt(i));
			}else {
				answer = answer +  romanMap.get(romanString.charAt(i));
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		
		Roman2Integer roi = new Roman2Integer();
		int answer = roi.romanToInt("VII");
		System.out.println(answer);
	}
}
