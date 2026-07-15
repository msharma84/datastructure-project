package com.arrays;

/**
 * https://www.youtube.com/watch?v=YOiBIsSkNLo
 *
 * Count total number of zeros and ones in array
 * arr = [0,0,1,0,1,0,1,1]
 * result = [4,3]
 *
 * Time Complexity = O(n)
 *
 * */
public class CountZeroAndOne {

    public static void main(String[] args) {

        int [] arr = {0,0,1,0,1,0,1,1,1};
        int [] result = countZerosAndOnes(arr);
        System.out.println(result[0] + " : "+ result[1]);
    }

    private static int [] countZerosAndOnes(int [] arr){

        int len = arr.length;
        int countZero = 0;
        int countOne = 0;
        for(int i = 0; i < len; i++){
            if(arr[i] ==0){
                countZero++;
            }else{
                countOne++;
            }
        }
        return new int[]{countZero,countOne};
    }
}
