package com.arrays;

import java.util.Arrays;

/**
 * https://www.youtube.com/watch?v=L3y6eelqmlQ
 *
 * Move all the zeros to the left side of an array and the remaining data at right side
 * arr = [1,1,0,1,0,0,0,1]
 * result = [0,0,0,0,1,1,1,1]
 *
 * Time Complexity = O(n)
 *
 * */
public class MoveAllZeroToLeft {

    public static void main(String[] args) {
        int [] arr = {0,1,0,1,0,0,0,1,0};
        System.out.println(Arrays.toString(moveLeft(arr)));
    }

    private static int [] moveLeft(int [] arr){

        int len = arr.length;
        if(len == 0){
            return null;
        }
        int onePointer = 0;
        int temp;
        for(int zeroPointer = 0; zeroPointer < len; zeroPointer++){
            if(arr[zeroPointer] ==0){
                temp = arr[zeroPointer];
                arr[zeroPointer] = arr[onePointer];
                arr[onePointer] = temp;
                onePointer++;
            }
        }
        return arr;
    }
}
