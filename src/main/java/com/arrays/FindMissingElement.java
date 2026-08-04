package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode #3731. Find Missing Elements
 *
 * You are given an integer array nums consisting of unique integers.
 * Originally, nums contained every integer within a certain range. However,
 * some integers might have gone missing from the array.
 * The smallest and largest integers of the original range are still present in nums.
 * Return a sorted list of all the missing integers in this range. If no integers are missing,
 * return an empty list.
 *
 *  arr = [1,4,2,5]
 *  result = [3]
 *
 *  arr = [7,8,6,9]
 *  result = []
 *
 *  arr = [5,1]
 *  result = [2,3,4]
 *
 * */
public class FindMissingElement {

    public static void main(String[] args) {

        int [] nums = {5,1};
        List<Integer> l = findMissingElement(nums);
        System.out.println(l);
    }

    private static List<Integer> findMissingElement(int [] nums){

        List<Integer> list = new ArrayList<>();
        int len = nums.length;
        if(len == 0){
            return list;
        }
        // sort the array
        Arrays.sort(nums);
        int i=0;
        // find the maximum and minimum elements in the array.
        int end = nums[len-1];
        for(int start = nums[0]; start <= end; start++){
            if(start == nums[i]){
                i++;
            }else{
                list.add(start);
            }
        }
        return list;
    }
}
