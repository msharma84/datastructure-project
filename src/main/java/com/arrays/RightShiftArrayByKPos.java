package com.arrays;

/**
 * https://www.youtube.com/watch?v=qB781Qqi4Cg
 *
 * Right Shift elements in an array by k position
 *
 * Input : arr[] = {10, 20, 30, 40, 50, 60}
 * Position : 2
 * Output : arr[] = {50, 60, 10, 20, 30, 40}
 *
 * Time Complexity : O(log n)
 *
 */
public class RightShiftArrayByKPos {

    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50};
        int [] result = shiftPostion(arr,2);
        for(int j : result){
            System.out.print(j + " ");
        }
    }

    private static int [] shiftPostion(int [] arr, int position){

        int len = arr.length;
        int [] temp = new int [position];
        int k = position;
        for(int i =0; i <= k; i++, k--){
            temp[i] = arr[len-k];
        }

        for(int i = len-1-position; i >= 0 ; i--){
            arr[i+position] = arr[i];
        }
        System.arraycopy(temp, 0, arr, 0, position);
        return arr;
    }
}
