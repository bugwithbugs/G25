package Lecture34_Mar11_CSES2;
import java.util.Scanner;
 
public class Permutations {
    public static void bringLastToFront(int[] arr) {
        if (arr.length > 0) {
            int lastElement = arr[arr.length - 1];
            System.arraycopy(arr, 0, arr, 1, arr.length - 1);
            arr[0] = lastElement;
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            if (n == 1) {
                System.out.println(1);
            } else if (n > 1 && n < 4) {
                System.out.println("NO SOLUTION");
            }
            else {
                int[] arr = new int[n];
                int i = 1, j = n;
                for (int k = 0; k < n; k++) {
                    arr[k] = (k % 2 == 0) ? j-- : i++;
                }
                bringLastToFront(arr);
                StringBuilder sb = new StringBuilder();
                for (int num : arr) {
                    sb.append(num).append(" ");
                }
                System.out.println(sb);
            }
        }
    }
}
