package Lecture29_Feb27_QueueQues;

import java.util.ArrayDeque;
import java.util.Deque;

public class FirstNegativeInWindow {
    public static void main(String[] args) {
        int[] arr = { 3, -1, 4, -2, -6, 7, 8, 9 };
        int n = arr.length;
        int k = 3;

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            if (arr[i] < 0) {
                dq.add(i);
            }

            if (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.removeFirst();
            }

            // window starts at i = k-1
            if (i >= k - 1) {
                if (dq.isEmpty())
                    System.out.print(0 + " ");
                else
                    System.out.print(arr[dq.peekFirst()] + " ");
            }
        }

    }
}
