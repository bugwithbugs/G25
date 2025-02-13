package Lecture25_Feb13_BinarySearchAsst;

import java.util.Arrays;

public class PaintersPartition {

    static boolean isPossible(int[] boards, int painters, int maxTime) {
        int cnt = 1;
        int sum = 0;

        for (int board : boards) {
            if (sum + board > maxTime) {
                cnt++;
                sum = board;
            } else {
                sum += board;
            }
        }

        return cnt <= painters;
    }

    static int binarySearch(int[] arr, int painters) {

        int sum = 0, n = arr.length;
        Arrays.sort(arr);

        for(int i: arr)
        sum += i;

        int low = arr[n - 1];
        int high = sum;
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(arr, painters, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int painters = 2;
        int[] boards = { 1, 10 };
        System.out.println(binarySearch(boards, painters));
    }
}