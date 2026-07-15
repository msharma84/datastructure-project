package com.arrays;

/**
 * https://www.youtube.com/watch?v=YOiBIsSkNLo
 *
 * Multiply all element of an array with 10
 * arr = [5,6,7,8,9]
 * arr = [50,60,70,80,90]
 *
 * Time Complexity = O(n)
 *
 * */
public class MultiplyByTen {

    public static void main(String[] args) {

        int [] arr = {5,6,7,8,9};
        int [] result =  multiply(arr);
        for (int j : result)
            System.out.println(j);
    }

    private static int [] multiply(int[] arr){

        int len = arr.length;
        for(int i = 0 ; i < len; i++){
            arr[i] = arr[i] * 10;
        }
        return arr;
    }
}
