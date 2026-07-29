package com.arrays;

import java.util.Arrays;

/**
 * Dutch National Flag Algorithm
 *
 * The Dutch National Flag (DNF) algorithm is a highly efficient sorting technique designed by
 * computer scientist Edsger Dijkstra to group an array of items into three distinct categories
 * in a single pass. It solves the classic problem of sorting an array containing only three
 * values—conventionally represented as 0s, 1s, and 2s (or the red, white, and blue colors of the
 * Netherlands flag)—with O(n) time complexity and O(1) space complexity.
 *
 * arr = [1,0,1,2,0,1,2,0,0,1,2,1]
 * result = [0,0,0,0,1,1,1,1,1,2,2,2]
 *
 * Time Complexity = O(n)
 *
 * https://medium.com/@jyotsnay24/the-dutch-national-flag-algorithm-efficient-sorting-in-three-categories-5aabe8a35d61
 *
 * */
public class DutchNationalFlagAlgorithm {

    public static void main(String[] args) {

        int [] arr = {1,0,1,2,0,1,2,0,0,1,2,1};
        int [] result = algorithm(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int [] algorithm(int [] arr){

        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){
                if(arr[mid] == 0){
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    low++;
                } else if (arr[mid] == 1) {
                    mid++;
                }else{
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                }
        }
        return arr;
    }
}
