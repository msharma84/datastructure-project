package com.arrays;

/**
 *
 * Find the minimum element present in an array
 * arr = [11,10,4,40,5,6,7,80,9,10]
 * result = 4
 *
 * Time Complexity = O(n)
 *
 * */
public class MinimumElement {

    public static void main(String[] args) {

        int [] arr = {11,10,4,40,5,6,7,80,9,10};
        int min = minimum(arr);
        System.out.println(min);
    }

    private static int minimum(int [] arr){

        int len = arr.length;
        if(len ==0)
            return 0;

        int min = arr[0];
        for(int i =1; i < len; i++){
            if(min >= arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
