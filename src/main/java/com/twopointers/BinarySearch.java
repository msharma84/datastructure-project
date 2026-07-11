package com.twopointers;

public class BinarySearch {
    // https://www.youtube.com/watch?v=LfeH5aFeP7E

    public static void main(String[] args) {

        int [] arr = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35};
        int target = 21;
        int index = binarySearch(arr,target);
        System.out.println(index);
    }

    private static int binarySearch(int [] arr, int target){

        int length = arr.length;
        if(length == 0){
            return 0;
        }
        int low = 0;
        int high = length-1;
        int mid = low + (high - low) / 2; // minimize the integer overflow
        while(low <= high){
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
            // update mid value
            mid = low + (high - low) / 2; // minimize the integer overflow
        }
        return 0;
    }
}
