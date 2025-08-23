package leetcode;

/**
 *  Problem 14
 * */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String []strArray = new String []{"flower","flight","flora","floor"};
        String value = lcp.longestCommonPrefix(strArray);
        System.out.println("Longest Common Prefix : -"+value);
    }

    public String longestCommonPrefix(String [] arr){

        if(arr == null || arr.length == 0){
            return "";
        }
        String prefix = arr[0];
        for(String arrValue : arr) {
            while(arrValue.indexOf(prefix) !=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
