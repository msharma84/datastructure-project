package com.leetcode;

// https://leetcode.com/problems/search-insert-position/description/

public class SearchInsertPosition {

	public static void main(String[] args) {
		
		int [] arr = {1,3,5,6};
		int target = 3;
		
		int length = arr.length;
		
		int start=0;
		int end = length-1;
		int mid =0;
		
		while(start<=end) {
			mid = start + end / 2;
			/*
			 * if(target == arr[mid]) { return arr[mid]; }
			 */
		}
	}

}
