package com.arrays;

/**
 * https://www.youtube.com/watch?v=YOiBIsSkNLo
 *
 * Find the maximum element present in an array
 * arr = [1,10,4,40,5,6,7,80,9,10]
 * result = 80
 *
 * Time Complexity = O(n)
 *
 * */
public class MaximumElement {

    public static void main(String[] args) {

        int [] arr = {1,10,4,40,5,6,7,8,9,10};
        int result = findMaximumElement(arr);
        System.out.println(result);
    }

    static int findMaximumElement(int [] arr){
        int len = arr.length;
        if(len ==0){
            return -1;
        }

        int max = arr[0];
        for(int i =1; i < len; i++){
            if(max <= arr[i])
                max = arr[i];
        }
        return max;
    }
}
