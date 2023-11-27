package com.company.al.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public Boolean isValidP(String s){

        Map<Character,Character> parenthesValue = new HashMap<>();
        parenthesValue.put('(',')');
        parenthesValue.put('{','}');
        parenthesValue.put('[',']');


        for (int i =0; i < s.length()-1;i++){

            Character myChar = s.charAt(i);
            Character charValue = parenthesValue.get(myChar);

            if(charValue!=s.charAt(i+1)){
                return false;
            }
            i++;

        }

        return true;
    }

    public static void main(String[] args){
        String s = "(]";

        System.out.println(new ValidParentheses().isValid(s));

    }

}
