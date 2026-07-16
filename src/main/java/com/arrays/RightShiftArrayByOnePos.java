package com.arrays;

/**
 * https://www.youtube.com/watch?v=qB781Qqi4Cg
 *
 * Right Shift elements in an array by one index
 *
 * Input : arr[] = {10, 20, 30, 40, 50, 60}
 * Output : arr[] = {60, 10, 20, 30, 40, 50}
 * Time Complexity : O(log n)
 *
 */
public class RightShiftArrayByOnePos {

    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50,60};
        int [] result = shiftPosition(arr);
        for(int j : result)
            System.out.print(j + " ");
    }

    private static int [] shiftPosition(int [] arr){
        int len =arr.length;
        int lastElement = arr[len-1];
        for(int i = len-1; i > 0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastElement;
        return arr;
    }
}
