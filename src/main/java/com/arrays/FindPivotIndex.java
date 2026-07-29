package com.arrays;

import java.util.Arrays;

/**
 * https://www.youtube.com/watch?v=YNPgWjmztIg
 *
 * Pivot index at where sum of left side of array is equal to right side of array
 * arr = [1,7,3,6,5,6]
 * result = 3
 *
 * Time Complexity = O(n)
 *
 * */
public class FindPivotIndex {

    public static void main(String[] args) {

        int [] arr = {1,7,3,6,5,6};
        int pivot = findIndex(arr);
        System.out.println(pivot);
    }

    private static int findIndex(int [] arr){

        int len = arr.length;

        // Created two array which stores the sum of elements
        // moving from left to right -> [1, 8, 11, 17, 22, 28]
        // and from right to left -> [28, 27, 20, 17, 11, 6]
        int [] leftSum = new int [len];
        int [] rightSum = new int [len];

        int sum1 = 0;
        for(int i =0; i < len; i++){
            sum1 = sum1 + arr[i];
            leftSum[i] = sum1;
        }

        int sum2 = 0;
        for(int i =len-1; i >= 0; i--){
            sum2 = sum2 + arr[i];
            rightSum[i] = sum2;
        }

        System.out.println(Arrays.toString(leftSum));
        System.out.println(Arrays.toString(rightSum));

        // get the index at which contains the same element in the array
        // in both the above index 17 is the common element, so returning the index of it
        for(int i =0; i < len; i++){
            if(leftSum[i] == rightSum[i])
                return i;
        }
        return -1;
    }
}
