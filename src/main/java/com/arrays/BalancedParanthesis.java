package interview;

import java.util.Stack;

public class BalancedParanthesis {

    //  Write a method to detect if a given string has balanced parentheses — {}, [], and ().
    public static void main(String[] args) {

        BalancedParanthesis balancedParanthesis = new BalancedParanthesis();
        boolean returnValue = balancedParanthesis.isBalanced("{[()]}");
        System.out.println(returnValue);
    }

    public boolean isBalanced(String str){

        Stack<Character> stack = new Stack<>();

        for(Character ch : str.toCharArray()){
            if(ch == '{' || ch == '[' || ch == '('){
                stack.add(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                char open = stack.pop();
               if(!isMatching(open,ch)){
                   return false;
               }
            }
        }
        return stack.isEmpty();
    }

    private boolean isMatching(char open, char closed){
        return (open == '(' && closed == ')') ||
                (open == '[' && closed == ']') ||
                (open == '{' && closed == '}');
    }
}
