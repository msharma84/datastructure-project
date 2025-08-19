package interview;

public class ZeroFilledSubArray {

    // Given an integer array nums, return the subarrays filled with 0
    public static void main(String[] args) {

        //int [] nums = {1,2,0,0,3,4,0,0,5,0,0,0,6,0,7,8};
        int [] nums = {0,0,0,2,0,0};
        int length = nums.length;

        int ans = 0;
        int count = 0;
        for(int i = 0; i < length; i++){
            count = (nums[i] == 0) ? count+1:0;
            ans += count;
            System.out.println(ans + " "+ count + " "+i);
        }
        System.out.println("Total - "+ans);
    }
}
