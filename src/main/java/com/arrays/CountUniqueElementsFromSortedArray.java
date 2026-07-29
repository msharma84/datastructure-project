package com.arrays;
/**
 * https://www.youtube.com/watch?v=YNPgWjmztIg
 *
 * Count unique elements in an array
 * arr = [1,2,3,3,4,5,5,6,7,7]
 * result = 7
 *
 * Time Complexity = O(n)
 *
 * */
public class CountUniqueElementsFromSortedArray {

    public static void main(String[] args) {

        int [] arr = {1,2,3,3,4,5,5,6,7,7,8,8,8};
        int len = arr.length;

        int elements = 1;
        int i = 0;
        for(int j = i+1; j < len; i++, j++){
            if(arr[i] != arr[j]){
                elements++;
            }
        }
        System.out.println(elements);
    }
}
