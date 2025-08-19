package stringManipulation;

public class ReverseString {

    public static void main(String[] args) {

        String str = "#SomeBodyHelpMe!";
        char [] ch = str.toCharArray();
        int length = ch.length;
        char temp;
        int j = length-1;
        for(int i =0; i < length-1; i++){
            if(i >= j){
                break;
            }
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            j--;
        }
        System.out.println("By Brute Force - "+new String(ch));
        System.out.println("By StringBuilder reverse - "+new StringBuilder(str).reverse());
    }
}
