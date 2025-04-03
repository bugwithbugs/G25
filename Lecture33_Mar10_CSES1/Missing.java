package Lecture33_Mar10_CSES1;
import java.util.Scanner;
 
public class Missing {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = sc.nextInt();
            }
            long expectedSum = (long)n * (n + 1) / 2;
            long actualSum = 0;
            for (int num : arr) {
                actualSum += num;
            }
            System.out.println(expectedSum - actualSum);
        }
    }
}