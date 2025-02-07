package Lecture21_Feb04_StackQuestions_3;

import java.util.Stack;

public class NextGreaterElement {

    static int[] nextGreaterElement(int[] arr){
        int n = arr.length;

        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return nge;
    }
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 7, 13, 9 };

        int[] nge = nextGreaterElement(arr);

        for(int i: nge){
            System.out.print(i + " ");
        }
    }
}
