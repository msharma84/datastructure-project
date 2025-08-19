package stringManipulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {

    public static void main(String[] args) {

        String email = "mohitsharma603@gmail.com";
        System.out.println(isValidEmail(email));
        System.out.println(isValidEmailUsingPattern(email));
    }

    private static boolean isValidEmail(String s){
        return  (s.contains("@") && s.contains(".")) ? true : false;
    }

    private static boolean isValidEmailUsingPattern(String s){

        Pattern VALID_EMAIL_ADDRESS_REGEX =
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(s);
        return matcher.matches();

    }
}
