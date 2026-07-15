package com.arrays;

/**
 * https://www.youtube.com/watch?v=YOiBIsSkNLo
 *
 * Search target value index in an array, if no element found return -1
 * arr = [5,6,7,8,9]
 * target = 8
 *
 * Time Complexity = O(n)
 *
 * */
public class LinearSearch {

    public static void main(String[] args) {

        int [] arr = {5,6,7,8,9};
        int target = 7;
        int result = linearSearch(arr,target);
        System.out.println(result);
    }

    private static int linearSearch(int [] arr, int target){
        int len = arr.length;
        for(int i =0; i < len; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
