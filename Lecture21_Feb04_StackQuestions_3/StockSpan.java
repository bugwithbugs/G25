package Lecture21_Feb04_StackQuestions_3;

import java.util.Stack;

public class StockSpan {

    public static int[] nextGreaterToLeft(int[] prices) {
        int n = prices.length;
        int[] ngeLeft = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ngeLeft[i] = -1; // -1 means no greater element to the left
            } else {
                // store the index of the greater element to the left
                ngeLeft[i] = stack.peek();
            }

            stack.push(i);
        }

        return ngeLeft;
    }

    public static void calculateStockSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];

        int[] ngeLeft = nextGreaterToLeft(prices);

        for (int i = 0; i < n; i++) {
            if (ngeLeft[i] == -1) {
                span[i] = i + 1;
            } else {
                span[i] = i - ngeLeft[i];
            }
        }

        for (int s : span) {
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int n = scanner.nextInt();

        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        calculateStockSpan(prices);

        scanner.close();
    }
}
