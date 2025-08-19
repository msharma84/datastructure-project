package stringManipulation;

public class OnlyDigitString {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "xyz";
        String s3 = "123";

        System.out.println("S1 - "+ onlyDigit(s1));
        System.out.println("S2 - "+ onlyDigit(s2));
        System.out.println("S3 - "+ onlyDigit(s3));
    }

    public static boolean onlyDigit(String s){

        int j = 0;
        int length = s.length();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                j++;
            }
        }
        return (length == j) ? true :  false;
    }
}
