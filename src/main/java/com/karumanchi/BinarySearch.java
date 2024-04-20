package com.karumanchi;

import java.util.Arrays;

public class BinarySearch {

	public int search(int [] arr, int target) {
		
		int low=0;
		int high = arr.length-1;
		
		while(low<=high) {
			int middleIndex  = low + (high - low) / 2;
			
			if(arr[middleIndex]==target) {
				return middleIndex ;
			}
			if(arr[middleIndex]<target) {
				low = middleIndex  + 1;
			}else {
				high = middleIndex  -1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,5,8,12,16,23,38,56,72,91};
		int target = 91;
		BinarySearch bs = new BinarySearch();
		int index = bs.search(arr, target);
		System.out.println(index);
		int index2 = Arrays.binarySearch(arr, target);
		System.out.println(index2);
		//int index3 = Collections.binarySearch(null, target);
	}
}
