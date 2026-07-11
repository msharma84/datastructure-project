package com.twopointers;

public class TwoSumUsingTwoPointers {

    public static void main(String[] args) {

        // https://youtu.be/WNU8MmSMSUs?si=d4jeWIOgYO4F8inX
        TwoSumUsingTwoPointers twoPointers = new TwoSumUsingTwoPointers();
        int target = 9;
        int [] arr = {2,7,11,15};
        int [] result = twoPointers.twoSum(arr, target);
        if(result!=null){
            System.out.println(result[0] + "-"+result[1]);
        }
    }

    private int [] twoSum(int [] arr,int target){
        int len = arr.length;
        int left = 0;
        int right = len-1;
        while(left < right){
            int sum = arr[left]+arr[right];
            if(sum==target){
                return new int []{left,right};
            } else if (sum > target) {
                right--;
            }else{
                left++;
            }
        }
        return null;
    }
}
