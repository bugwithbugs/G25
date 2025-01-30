package Lecture08_Dec19_BinarySearchQuestions;

import java.util.Scanner;
public class UpperBound {

    public static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target element to find the upper bound for: ");
        int target = scanner.nextInt();

        int result = upperBound(arr, target);
        System.out.println("The upper bound index for " + target + " is: " + result);

        scanner.close();
    }
}
