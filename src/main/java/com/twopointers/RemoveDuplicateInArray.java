package com.twopointers;

import java.util.Arrays;

public class RemoveDuplicateInArray {

    // https://youtu.be/96fX-5SEdWk?si=fTh5E-CwbAaPX-im
    public static void main(String[] args) {

        int [] arr = new int[]{1,2,2,3,3,3,4,4,4,4,5,6,6,6,6,9};
        int [] distinct= removeDuplicate(arr);
        for(int i =0 ; i< distinct.length; i++){
            System.out.println(distinct[i]);
        }
    }

    private static int [] removeDuplicate(int [] arr){
        // Edge case: if array is empty, return 0
        if (arr.length == 0) {
            return new int[0];
        }

        int unique = 0;  // Pointer to track the index of the unique element
        int length = arr.length;

        // Iterate through the array starting from the second element
        for(int i = 1; i < length; i++){
            // If a new unique element is found
            if(arr[unique] != arr[i]){
                unique++;// Move the unique tracker forward
                arr[unique] = arr[i];// Overwrite duplicate with unique value
            }
        }
        // Create and return a trimmed copy containing only unique elements
        return Arrays.copyOf(arr,unique+1);
    }
}
