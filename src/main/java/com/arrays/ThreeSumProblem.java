package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Refer : https://www.youtube.com/watch?v=PShx8lzd8_E
 *
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such
 * that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 *
 * Time Complexity: O(n²) — Sorting takes (O(n log n)), and the nested loops take O(n²).
 * Space Complexity: (O(log n)) to O(n) — Depends on the implementation of the Arrays.sort() algorithm
 *  in Java (Dual-Pivot Quicksort).
 *
 * Key Algorithm Steps :
 * 1. Sorting: Arranges elements in ascending order, which is required for the two-pointer movement.
 * 2. Fixing First Element: Loop index i picks the first element of the triplet.
 * 3. Two-Pointer Search: Set left right after i, and right at the very end of the array.
 * 4. Duplicate Elimination: if checks and while loops skip identical numbers to ensure all returned
 * triplets are unique.
 *
 * */
public class ThreeSumProblem {

    public static void main(String[] args) {

        int [] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(arr);
        System.out.println(list);
    }

    private static List<List<Integer>> threeSum(int [] arr){

        if(arr.length ==0){
            return null;
        }

        List<List<Integer>> resultList = new ArrayList<>();

        // 1. Sort the array to use the two-pointer technique and skip duplicates
        Arrays.sort(arr);

        for(int i =0 ; i < arr.length-2; i++){

            // If the current starting number is greater than 0,
            // no three numbers can sum to 0 (since the array is sorted)
            if(arr[i] >0){
                break;
            }
            // Skip duplicate values for the first element
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int left = i + 1;
            int right = arr.length-1;
            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];

                if(sum ==0){
                    resultList.add(Arrays.asList(arr[i],arr[left],arr[right]));

                    // Skip duplicate values for the second element
                    while(left < right && arr[left] ==arr[left+1]){
                        left ++;
                    }

                    // Skip duplicate values for the third element
                    while(left < right && arr[right] == arr[right-1]){
                        right--;
                    }
                    // Move both pointers inward after finding a valid triplet
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Sum is too small, move left pointer to increase sum
                    left ++;
                }else{
                    // Sum is too large, move right pointer to decrease sum
                    right --;
                }
            }
        }
        return resultList;
    }
}
