package Lecture36_Mar17_Stack_Trees;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWords {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String paragraph = scanner.nextLine();
        String reversedParagraph = reverseWords(paragraph);
        System.out.println(reversedParagraph);
        scanner.close();
    }

    public static String reverseWords(String paragraph) {
        Stack<String> stack = new Stack<>();
        String[] words = paragraph.split(" ");
        for (String word : words) {
            stack.push(word);
        }
        StringBuilder reversedParagraph = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedParagraph.append(stack.pop());
            reversedParagraph.append(" ");
        }
        return reversedParagraph.toString().trim();
    }
}
