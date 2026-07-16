package com.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 *  Given an array arr[] of n integers and a target value,
 *  check if there exists a pair whose sum equals the target.
 *  you must return the indices of the two numbers that add up to the target.
 *
 *  Input: arr[] = [0, -1, 2, -3, 1], target = -2
 *  Time Complexity: because the array is traversed only once, and HashMap lookups take average time.
 *  Space Complexity: to store elements in the HashMap
 * */
public class TwoSumProblem {

    public static void main(String[] args) {

        int [] arr = {2,11,7,15};
        int target = 9;

        TwoSumProblem twoSumProblem = new TwoSumProblem();
        int [] value = twoSumProblem.twoSum(arr,target);
        for(int i=0;i<value.length;i++){
            System.out.println(value[i]);
        }
    }

    public int[] twoSum(int[] nums, int target){

        Map<Integer,Integer> map = new HashMap<>();
        int size = nums.length;
        for(int i=0;i<size;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),nums[i]};
            }
            map.put(nums[i],nums[i]);
        }
        return new int[]{};
    }
}
