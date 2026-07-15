package com.arrays;

/**
 * https://www.youtube.com/watch?v=YOiBIsSkNLo
 *
 * Find the average of all element of an array
 * arr = [5,6,7,8,9]
 * sum = 7
 *
 * Time Complexity = O(n)
 *
 * */

public class AverageOfArray {

    public static void main(String[] args) {
        int [] arr =  {2,4,1,3};
        double result = average(arr);
        System.out.println(result);
    }

    private static double average(int [] arr){
        int length = arr.length;
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return (double) sum / length;
    }
}
