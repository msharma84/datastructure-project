package com.twopointers;

public class OccurrenceUsingBinarySearch {

    // https://www.youtube.com/watch?v=vIWRqAmDJdc&t=1506s
    public static void main(String[] args) {

       // int[] arr = {10,20,25,30,30,30,40,41,44,50};
        int[] arr = {10,20,25,30,30,30};
        int target = 10;
        int lowerBound = getLowerBoundValue(arr,target);
        int upperBound = getUpperBoundValue(arr,target);

        int occurrence = upperBound - lowerBound;
        System.out.println(occurrence);
    }

    private static int getLowerBoundValue(int [] arr,int target){

        int length = arr.length;
        if(length==0){
            return -1;
        }
        int ans = length;
        int low = 0;
        int high = length-1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int getUpperBoundValue(int [] arr, int target){

        int length = arr.length;
        if(length==0){
            return -1;
        }
        int ans = length;
        int low = 0;
        int high = length -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] <= target){
                low = mid + 1;
            }else{
                ans = mid;
                high = mid -1;
            }
        }
        return ans;
    }
}
