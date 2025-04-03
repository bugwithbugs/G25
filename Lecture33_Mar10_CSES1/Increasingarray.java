package Lecture33_Mar10_CSES1;
import java.util.Scanner;

public class Increasingarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        long moves = 0;
        int prev = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < prev) {
                moves += prev - arr[i];
                arr[i] = prev;
            }
            prev = arr[i];
        }
        System.out.println(moves);
        scanner.close();
    }
}
