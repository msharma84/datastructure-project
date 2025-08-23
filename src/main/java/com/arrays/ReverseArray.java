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
public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		printArray(arr);
		reverseArray(arr);
		System.out.println("Reversing the Array !!!");
		printArray(arr);
	}

	static void reverseArray(int arr[]) {

		int start = 0;
		int len = arr.length - 1;
		int temp;

		while (start < len) {
			temp = arr[start];
			arr[start] = arr[len];
			arr[len] = temp;
			start++;
			len--;
		}
	}

	static void printArray(int arr[]) {

		int len = arr.length - 1;
		for (int i = 0; i <= len; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
