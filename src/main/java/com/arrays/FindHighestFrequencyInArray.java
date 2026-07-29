package com.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.youtube.com/watch?v=qB781Qqi4Cg
 *
 * Find the highest frequency of a number in an array
 * arr = [1,2,2,3,4,5,3,3,4,5,5,3]
 * result = 3
 *
 * Time Complexity = O(n)
 *
 * */
public class FindHighestFrequencyInArray {

    public static void main(String[] args) {

        int [] arr = {1,2,2,3,4,5,3,3,4,5,5,3};
        int frequency = findHighestFrequency(arr);
        System.out.println(frequency);
    }

    private static int findHighestFrequency(int[] arr) {

        int len = arr.length;
        if(len ==0)
            return -1;

        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        int maxFrequency = 0;
        int maxKey = 0;
        for(int key : map.keySet()){
            int currentKeyValue = map.get(key);
            if(currentKeyValue > maxFrequency){
                maxFrequency = currentKeyValue;
                maxKey = key;
            }
        }
        return maxKey;
    }
}
