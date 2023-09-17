package com.company.al;

import java.io.IOException;
import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static void main(String[] args) throws IOException {
        String[] tokens = new String[] { "2", "1", "+", "3", "*" };
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        int returnValue = 0;
        String operators = "+-*/";
        Stack<String> stack = new Stack<String>();
        for (String t : tokens) {
            if (!operators.contains(t)) {
                stack.push(t);
            } else {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                switch (t) {
                    case "+" -> stack.push(String.valueOf(a + b));
                    case "-" -> stack.push(String.valueOf(b - a));
                    case "*" -> stack.push(String.valueOf(a * b));
                    case "/" -> stack.push(String.valueOf(b / a));
                }
            }
        }
        returnValue = Integer.parseInt(stack.pop());
        return returnValue;
    }
}

