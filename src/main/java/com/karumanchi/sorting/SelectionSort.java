/**
 * Selection Sort Implementation in java
 * 
 * Selection sort is one of the simplest sorting algorithm available. It sorts an array by repeatedly finding the 
 * minimum element from the unsorted part and putting it at the beginning. The array will have two part in this process.
 * A subarray which is sorted and other subsorted which is yet to be sorted.
 * 
 * Time Complexity  -  O(n2) 
 * 
 * Space Complexity - O(1)
 * 
 * */

package com.karumanchi.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		SelectionSort sort = new SelectionSort();
		int array[] = {5,2,4,1,3,6};
		sort.sort(array);
		
		System.out.println("Sorted Array :");
		sort.print(array);
	}
	
	public void sort(int arr[]){
		
		int length = arr.length;
		for(int i=0 ; i < length; i++){
			// find the minimum element in unsorted array
			int mid_value = i;
			for(int j=i+1; j < length ; j++){
				if( arr[j] < arr[mid_value]){
					mid_value = j;
				}
			}
			int temp = arr[mid_value];
			arr[mid_value] = arr[i];
			arr[i] = temp;
		}
	}
	
	public void print(int arr[]){
		
		int length = arr.length;
		for(int i=0 ;i < length ; i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}