package arrays;

import java.util.Arrays;

public class Array6 {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};

        int length = arr.length;
        int oddPointer = 0;
        int evenPointer = 0;
        int temp = 0;
        for(int i = 0; i < length - 1 ; i++){
            if(arr[i]  % 2 ==0 ){
                evenPointer = i;
                evenPointer++;
            }else{
                oddPointer = i;
                temp = arr[evenPointer];
                arr[evenPointer] = arr[oddPointer];
                arr[oddPointer] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
