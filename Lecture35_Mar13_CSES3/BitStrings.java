package Lecture35_Mar13_CSES3;
import java.util.Scanner;
 
public class BitStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = 1;
        for (int i = 0; i < n; i++) {
            result = (result * 2L) % 1_000_000_007;
        }
        System.out.println(result);
        scanner.close();
    }
}