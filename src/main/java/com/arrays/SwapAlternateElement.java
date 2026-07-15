package com.arrays;

import java.util.Arrays;

/**
 * https://www.youtube.com/watch?v=YOiBIsSkNLo
 *
 * Swap alternate element in an array
 * arr = [1,2,3,4,5,6,7,8]
 * result = [2,1,4,3,6,5,8,7]
 *
 * Time Complexity = O(n)
 *
 * */
public class SwapAlternateElement {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        arr = swapElement(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }

    private static int [] swapElement(int [] arr){

        int len = arr.length;
        for(int i =0 ; i< len; i= i+2){
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }
}
