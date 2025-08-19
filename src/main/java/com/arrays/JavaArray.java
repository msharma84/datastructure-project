package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArray {

    public static void main(String[] args) {

        int [] arr = {5,3,7,6,9,4,2,8,1};
        Arrays.sort(arr);
        for(int i : arr){
            System.out.print(i);
        }

        int index = Arrays.binarySearch(arr,4);
        System.out.println("Index of search element : - "+index);

        int [] numbers = new int [5];
        Arrays.fill(numbers,10);
        System.out.println(Arrays.toString(numbers));

        int [] numbers1 = {1,2,3};
        int [] numbers2 = {1,2,3};
        boolean isEqual = Arrays.equals(numbers1,numbers2);
        System.out.println("Is Arrays are equal : "+isEqual);

        System.out.println("Is Arrays are equal using custom() : "+JavaArray.arraysComparison(numbers1,numbers2));

        int [] num = new int[5];
        Arrays.setAll(num, i -> i+1);
        System.out.println("Generated Array : "+Arrays.toString(num));

        int [] reversedArray = JavaArray.reverse(arr);
        System.out.println("Reversed Array : - "+Arrays.toString(reversedArray));

        int [] fetchMax = {23,25,4,66,900,67,60635,1,5,77,342};
        int max = JavaArray.max(fetchMax);
        System.out.println("Max element : "+max);

        int sumOfAllElement = JavaArray.sumOfAllElement(arr);
        System.out.println("Sum of all element in an array : "+sumOfAllElement);

        int [] reverse =  JavaArray.reverse1(arr);
        System.out.println("Another reverse method - "+Arrays.toString(reverse));


        String [] stringArr = {"apple","banana","mango","box","been","fox"};
        List<String> l = new ArrayList<>();
        for(String s : stringArr){
            if(s.startsWith("B") || s.startsWith("b")){
                l.add(s);
            }
        }
        System.out.println(l);
    }

    public static boolean arraysComparison(int [] a, int [] b){
        if(a == null || b == null)
            return false;
        if(a.length != b.length)
            return false;
        boolean flag = true;
        int length = a.length;
        for(int i =0 ; i < length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return flag;
    }

    public static int[] reverse(int [] a){

        int length = a.length;
        int i =0;
        int [] tempArray = new int[length];
        for(int j = length-1; j >= 0; j--){
            tempArray[i] = a[j];
            i++;
        }
        return tempArray;
    }

    public static int max(int [] a){
        if(a.length==0)
            return -1;

        int max = a[0];
        int length = a.length;
        for(int i =1; i < length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    public static int sumOfAllElement(int [] a){

        if(a.length==0)
            return -1;

        int length = a.length;
        int sum =0;
        for(int i = 0; i < length; i++){
            sum += a[i];
        }
        return sum;
    }

    public static int[] reverse1(int [] a){

        int length = a.length;
        if(length > 0){
            int j = length-1;
            int temp = 0;
            for(int i =0; i < length; i++){
                if(i==j){
                    break;
                }
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j--;
            }
        }else{
            throw new UnsupportedOperationException("Length must be greater than 1");
        }

        return a;
    }
}
