package stringManipulation;

public class StringQuestion {

    public static void main(String[] args) {

        String str = "Java is awesome 2017 and the year is 2025";
        StringQuestion stringQuestion = new StringQuestion();
        String returnValue =  stringQuestion.reverseDigitInString(str);
        System.out.println(returnValue);
    }

    public String reverseDigitInString(String s){

        StringBuilder sb = new StringBuilder();
        String [] str = s.split(" ");
        for(String s1 : str){
            if(isNumeric(s1)){
               StringBuilder newSb = new StringBuilder(s1);
               sb.append(newSb.reverse()+" ");
            }else {
                sb.append(s1 + " ");
            }
        }
        return sb.toString();
    }

    public boolean isNumeric(String s){

        for(Character ch : s.toCharArray()){
            if(!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }
}
