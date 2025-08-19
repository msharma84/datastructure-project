package arrays;

import java.util.Arrays;

public class Array4 {
    // Given an integer array, move all zeroes to the end
    public static void main(String[] args) {

        int [] arr = {1,1,0,0,2,0,3,0,4,0,5,0,6,0,0,7,0,9,0};

        int length = arr.length;

        int left =0;
        int right =0;
        int temp = 0;

        // Bekar hai yeh portion
        for(int i = 0; i < length; i++){
            if(arr[left] >= 0 && arr[right] > 0){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
        System.out.println(Arrays.toString(arr));

        // use this instead
        left = 0;
        temp =0;
        for(int right1 = 0; right1 < length; right1++){
            if(arr[right1] !=0){
                temp = arr[left];
                arr[left] = arr[right1];
                arr[right1] = temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
