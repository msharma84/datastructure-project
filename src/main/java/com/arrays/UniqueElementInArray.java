package com.arrays;

/**
 * https://www.youtube.com/watch?v=L3y6eelqmlQ
 *
 * Find the unique element in the array
 * arr = [1,2,2,1,3,4,5,5,4]
 * result = 3
 *
 * Time Complexity = O(n)
 *
 * */
public class UniqueElementInArray {

    public static void main(String[] args) {
        int [] arr = {1,2,2,1,3,4,5,5,4};
        int element =  uniqueElement(arr);
        System.out.println(element);
    }

    private static int uniqueElement(int [] arr){

        /**
         * Basic nature of XOR
         * xor of same number return -> 0
         * xor of number by zero return -> number
         * */
        int xorSum = 0;
        for(int n : arr){
            xorSum = xorSum ^ n;
        }
        return xorSum;
    }
}
