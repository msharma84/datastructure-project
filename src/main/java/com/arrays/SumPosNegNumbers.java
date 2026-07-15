package com.arrays;

/**
 * https://www.youtube.com/watch?v=YOiBIsSkNLo
 *
 * Find the sum of positive numbers and negative numbers in an array
 * arr = [-1,1,-2,2,-3,3,-4,4,-5,5]
 * result = [-15,15]
 *
 * Time Complexity = O(n)
 *
 * */
public class SumPosNegNumbers {

    public static void main(String[] args) {

        int [] arr = {-1,1,-2,2,-3,3,-4,4,-5,5};
        int [] result = sumOfPositiveAndNegative(arr);
        System.out.println(result[0] + " : "+ result[1]);
    }

    static int [] sumOfPositiveAndNegative(int [] arr){
        int [] result = new int [2];
        int len = arr.length;
        int pos = 0;
        int neg = 0;
        for(int i =0; i < len; i++){
            if(arr[i] > 0){
                pos += arr[i];
            }else{
                neg += arr[i];
            }
        }
        result[0]=neg;
        result[1]=pos;
        return result;
    }
}
