package Lecture29_Feb27_QueueQues;

import java.util.PriorityQueue;

public class Leetcode215_KthLargest {

    static int findKthLargest(int[] arr, int k) {
        // Note: by default priority queue is minHeap
        // LEARN how to declare maxHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);

            if (pq.size() > k) {
                pq.remove();
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {

        int[] arr = { 3,2,3,1,2,4,5,5,6 };
        System.out.println(findKthLargest(arr, 4));
    }
}
