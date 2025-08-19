package stringManipulation;

public class FindNumberOfWords {

    public static void main(String[] args) {

        String str = "This will going to fun";
        String [] subStr = str.split(" ");
        System.out.println(subStr.length);
    }
}
