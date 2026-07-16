package com.arrays;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://www.youtube.com/watch?v=qB781Qqi4Cg
 * Reverse an ARRAY using two pointers
 *
 * Input : arr[] = {1, 2, 3} Output : arr[] = {3, 2, 1}
 *
 * Input : arr[] = {4, 5, 1, 2} Output : arr[] = {2, 1, 5, 4}
 *
 * Input : arr[] = {1,2,3,4,5,6,7,8,9} Output : arr[] = {9,8,7,6,5,4,3,2,1}
 *
 * Time Complexity : O(log n)
 *
 */
public class ReverseArraryTwoPointers {

    public static void main(String[] args) {
        int [] arr  =  {1,2,3,4,5,6,7,8,9};
        int [] result = reverse(arr);
        for(int j : result)
            System.out.print(j + " ");

    }

    private static int [] reverse(int [] arr){
        int len = arr.length;
        int left = 0;
        int right = len-1;
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
