package com.arrays;

/**
 * https://www.youtube.com/watch?v=YOiBIsSkNLo
 *
 * Print alternate extreme elements in an array
 * arr = [1,2,3,4,5,6,7,8]
 * print - 1,8,2,7,3,6,4,5
 *
 * Time Complexity = O(n)
 *
 * */
public class PrintAlternateExtreme {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8};
        int len = arr.length;
        int left = 0;
        int right = len-1;
        while(left <= right){
            System.out.println(arr[left] + " : " +arr[right]);
            left++;
            right--;
        }
    }
}
