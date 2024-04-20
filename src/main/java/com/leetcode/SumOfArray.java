package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SumOfArray {

	public int[] twoSumBruteForce(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}

	public int[] twoSumHashMap(int[] nums, int target) {

		int length = nums.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < length; i++) {
			map.put(nums[i], i);
		}

		/*
		 * for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		 * System.out.println(entry.getKey() + " : " + entry.getValue()); }
		 */

		for (int i = 0; i < length; i++) {
			int complement = target - nums[i];

			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, map.get(complement) };
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		SumOfArray sum = new SumOfArray();
		int[] results1 = sum.twoSumBruteForce(nums, target);

		int[] results2 = sum.twoSumHashMap(nums, target);

		for (int i = 0; i < results1.length; i++) {
			System.out.println("results =" + results1[i]);
		}

		for (int i = 0; i < results2.length; i++) {
			System.out.println("results =" + results2[i]);
		}
	}
}
