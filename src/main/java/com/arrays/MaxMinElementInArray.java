package com.arrays;

/**
 *
 * Find the minimum element present in an array
 * arr = [11,10,4,40,5,6,7,80,9,10]
 * result = 4,80
 *
 * Time Complexity = O(n)
 *
 * */
public class MaxMinElementInArray {

    public static void main(String[] args) {

        int [] arr = {11,10,4,40,5,6,7,80,9,10};
        int [] result = getMaxMin(arr);
        if(result!=null)
            System.out.println(result[0] + "," +result[1]);
    }

    private static int [] getMaxMin(int [] arr){

        int len = arr.length;
        if(len == 0){
            return null;
        }

        int [] value = new int[2];
        int max = arr[0];
        int min = arr[0];

        for(int i =1; i < len; i++){
            if(max <= arr[i])
                max = arr[i];

            if(min >= arr[i])
                min = arr[i];
        }
        value[0] = min;
        value[1] = max;
        return value;
    }
}
