package dsa.array;

import java.util.Arrays;

/**
 * Check if two arrays are equal or not
 * 
 * Given two arrays, arr1 and arr2 of equal length N, the task is to find if the
 * given arrays are equal or not. Two arrays are said to be equal if:
 * 
 * both of them contain the same set of elements, arrangements (or permutations)
 * of elements might/might not be same. If there are repetitions, then counts of
 * repeated elements must also be the same for two arrays to be equal.
 * 
 * Input: arr1[] = {1, 2, 5, 4, 0}, arr2[] = {2, 4, 5, 0, 1} Output: Yes
 * 
 * Input: arr1[] = {1, 2, 5, 4, 0, 2, 1}, arr2[] = {2, 4, 5, 0, 1, 1, 2} Output:
 * Yes
 *
 * Input: arr1[] = {1, 7, 1}, arr2[] = {7, 7, 1} Output: No
 * 
 */
public class EqualArray {

	public static void main(String[] args) {
		
		 int arr1[] = { 3, 5, 2, 5, 2 };
	     int arr2[] = { 2, 3, 5, 5, 2 };
	 
        if (areEqual(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
	}

	static boolean areEqual(int arr1[], int arr2[]) {

		int n = arr1.length;
		int m = arr2.length;

		if (n != m)
			return false;

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for (int i = 0; i < n; i++) {
			if(arr1[i] != arr2[i])
				return false;
		}

		return true;
	}

	static void printArray(int arr[]) {

		int len = arr.length - 1;
		for (int i = 0; i <= len; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
