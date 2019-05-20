/**
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
 * 
 * **/

package com.karumanchi.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort bSort = new BubbleSort();
		int arr[] = {100,5,101,10,1000,50};
		
		bSort.sort(arr);
		System.out.println("Sorted Array :");
		bSort.print(arr);
	}
	
	public void sort(int [] arr){
		
		int length = arr.length;
		for(int i=0 ; i < length; i++){
			for(int j=0; j < length-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public void print(int arr []){
		
		int length = arr.length;
		for(int i =0; i < length; i++){
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
}
