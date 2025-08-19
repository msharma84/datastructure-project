package arrays;

public class Count1Occurrence {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 0, 1, 0, 1, 1, 0};
        int length = arr.length;
        int count = 0;
        for(int i = 0 ; i < length ; i++){
                if(arr[i] == 1){
                    count += 1;
            }
        }
        System.out.println("Total occurrence - "+count);
    }
}
