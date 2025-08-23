package dsa.array;

/**
 * Reverse an ARRAY
 * 
 * Input : arr[] = {1, 2, 3} Output : arr[] = {3, 2, 1}
 * 
 * Input : arr[] = {4, 5, 1, 2} Output : arr[] = {2, 1, 5, 4}
 * 
 * Time Complexity : O(n)
 * 
 */
public class ReverseArrayRecursive {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		printArray(arr);
		reverseArray(arr, 0, arr.length - 1);
		System.out.println("Reversing the Array !!!");
		printArray(arr);
	}

	static void reverseArray(int[] arr, int start, int end) {

		int temp;
		if (start >= end)
			return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverseArray(arr, start + 1, end - 1);
	}

	static void printArray(int arr[]) {

		int len = arr.length - 1;
		for (int i = 0; i <= len; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
