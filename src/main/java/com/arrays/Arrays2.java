// Check if subarray with given product exists in an array
package arrays;

public class Arrays2 {

    public static void main(String[] args) {

        int [] arr =  {-2, -1, 3, -4, 5};
        int len = arr.length;
        int k = 2;

        for(int i =0; i < len; ++i){
            int product = 1;
            for(int j = i; j <len; ++j)
            {
                product *= arr[i];
                if(product == k){
                    System.out.println("Possible");
                }
            }
        }
        System.out.println("Not Possible");
    }
}
