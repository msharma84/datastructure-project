package arrays;

import java.util.Arrays;

// Rotate the array clockwise and anticlockwise by no of positions.
public class ArrayRotation {

    public static void main(String[] args) {

        // Brute Force
        int [] arr = {1,2,3,4,5,6,7,8};
        int k = 3;

        int [] rotate = new int [k] ;
        int length = arr.length;
        int [] finalArray = new int [length];
        for(int i = k-1 ; i >= 0 ; i--){
            rotate[i] = arr[i];
        }
        int j =0 ;
        for(int i = k ; i < length; i++){
            finalArray[j] = arr[i];
            j++;
        }
        j = 0;
        for(int i = length -k ; i < length; i++){
            finalArray[i] = rotate[j];
            j++;
        }
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(rotate));
        //System.out.println(Arrays.toString(finalArray));

        // Optimize
        int [] arr1 = {1,2,3,4,5,6,7,8};
        for(int i =0 ; i < k; i++){
            int temp = arr1[0];
            for(int l = 0; l < length-1; l++){
                arr1[l] = arr1[l+1];
            }
            arr1[length-1] = temp;
        }
        System.out.println("Left rotation -  "+Arrays.toString(arr1));

        int [] arr2 = {4,5,6,7,8,1,2,3};
        for(int i =0 ; i < k; i++){
            int temp = arr2[length-1];
            for(int l = length-1; l > 0; l--){
               arr2[l] = arr2[l-1];
            }
            arr2[0] = temp;
        }
        System.out.println("Right rotation - "+Arrays.toString(arr2));
    }
}
