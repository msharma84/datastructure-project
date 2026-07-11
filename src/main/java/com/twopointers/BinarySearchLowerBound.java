package com.twopointers;

public class BinarySearchLowerBound {

    // https://www.youtube.com/watch?v=vIWRqAmDJdc&t=1506s

    public static void main(String[] args) {

        int[] arr = {10,20,25,30,30,35,40,41,44,50};
        int target = 30;
        int result =  lowerBoundValue(arr,target);
        System.out.println(result);
    }

    private static int lowerBoundValue(int [] arr,int target){

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
}
