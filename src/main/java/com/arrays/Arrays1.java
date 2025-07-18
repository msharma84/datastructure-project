// Java program to split an array
// into two equal sum subarrays
package arrays;

public class Arrays1 {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,5};
        int n = arr.length;

        int returnIndex = index(arr,n);
        if(returnIndex ==-1){
            System.out.println("Not Possible");
        }else{
            for(int i =0; i< returnIndex; i++){
                System.out.print(arr[i]);

            }
            System.out.println();
            for(int i = returnIndex; i <n; i++){
                System.out.print(arr[i]);
            }
        }
    }

    static int index(int [] arr, int n){
        int total = 0;
        for(int i =0; i < n ; i++) {
            total += arr[i];
        }
        if(total %2 !=0){
            System.out.println("Not Possible");
        }
        int halfSum = total/2;
        int leftSum = 0;
        for(int i=0; i<n;i++){
            leftSum += arr[i];

            if(halfSum == leftSum){
               return i+1;
            }
        }
        return -1;
    }
}
