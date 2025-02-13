package Lecture25_Feb13_BinarySearchAsst;

public class BookAllocation {

    static boolean isPossible(int[] arr, int students, int maxPages) {
        int n = arr.length;
        int cnt = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (sum + arr[i] > maxPages) {
                cnt++;
                sum = arr[i];
            } else 
                sum += arr[i];
        }

        return cnt <= students;
    }

    static int binarySearch(int[] arr, int students) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++)
            sum += arr[i];

        int low = 0;
        int high = sum; // Maximum possible maximum pages
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(arr, students, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int students = 3; // Number of students
        int[] arr = { 12, 34, 67, 90 }; // Pages in each book

        System.out.println(binarySearch(arr, students));
    }
}