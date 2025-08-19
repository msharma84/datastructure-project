package arrays;

import java.util.Arrays;

public class Array5 {

    public static void main(String[] args) {

        int [] arr = {1,0,0,1,0,1,1,0,0,1};

        int length = arr.length;
        int zeros = 0;
        for(int i =0; i < length-1; i++){
            if(arr[i] == 0){
                zeros++;
            }
        }
        for(int i =0; i < length-1; i++){
            if(i <= zeros-1){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }

        System.out.println(Arrays.toString(arr));

        int left = 0;
        int right = 0;
        int temp =0;

        int [] arr1 =  {1,0,0,1,0,1,1,0,0,1};
        for(int i =0; i < length-1; i++){
            if(arr1[right] == 0){
                temp = arr1[right];
                arr1[right] = arr1[left];
                arr1[left] = temp;
                left++;
            }
            right++;
        }

        System.out.println(Arrays.toString(arr1));
    }
}
