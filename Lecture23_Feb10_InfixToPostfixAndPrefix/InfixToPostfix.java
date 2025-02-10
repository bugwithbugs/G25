package Lecture23_Feb10_InfixToPostfixAndPrefix;

import java.util.Stack;

public class InfixToPostfix {

    public static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    // No precedence for brackets
    public static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    public static String infixToPostfix(String infix) {

        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char current = infix.charAt(i);

            if (Character.isLetterOrDigit(current)) {
                postfix.append(current);
            } else if (current == '(') {
                stack.push(current);
            } else if (current == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Remove the '(' from the stack
            } else if (isOperator(current)) {

                while (!stack.isEmpty() && precedence(current) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                // Push the current operator to the stack
                stack.push(current);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static String reverse(String s) {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String infix = "8/2-(3*4)+7";
        String postfix = infixToPostfix(infix);

        System.out.println("Postfix: " + postfix);
    }
}
