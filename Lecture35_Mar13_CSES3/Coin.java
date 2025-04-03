package Lecture35_Mar13_CSES3;
import java.util.Scanner;
public class Coin {

    static String solve(int A, int B) {
        if ((2 * A - B) % 3 != 0 || (2 * A - B) < 0 ||
            (2 * B - A) % 3 != 0 || (2 * B - A) < 0) {
            return "NO\n";
        }
        return "YES\n";
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            output.append(solve(A, B));
        }
        System.out.print(output);
    }
}