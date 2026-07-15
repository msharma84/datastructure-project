package com.arrays;

/**
 * https://www.youtube.com/watch?v=YOiBIsSkNLo
 *
 * Find first unsorted element in an array
 * arr = [3,4,5,2,6,7]
 * result = 2
 *
 * Time Complexity = O(n)
 *
 * */
public class FindElementUnSortedArray {

    public static void main(String[] args) {

        int [] arr = {3,4,5,6,6,7};
        int result = getElement(arr);
        System.out.println(result);
    }

    private static int getElement(int [] arr){

        int len = arr.length;
        for(int i =0; i < len; i++){
            if(arr[i+1] <= arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }
}
