package Lecture36_Mar17_Stack_Trees;

import java.util.Stack;
import java.util.Scanner;

public class RemoveConsecutiveWords {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String paragraph = scanner.nextLine();
        int remainingCount = removeConsecutiveDuplicates(paragraph);
        System.out.println(remainingCount);
        scanner.close();
    }

    public static int removeConsecutiveDuplicates(String paragraph) {
        String[] words = paragraph.split(" ");
        Stack<String> stack = new Stack<>();
        
        for (String word : words) {
            if (!stack.isEmpty() && stack.peek().equals(word)) {
                stack.pop();
            } else {
                stack.push(word);
            }
        }

        return stack.size();
    }
}

