package Lecture35_Mar13_CSES3;
import java.util.Scanner;

public class PalindromeReorder {
    
    static String solve(String S) {
        int N = S.length();
        char[] ans = new char[N];

        int[] freq = new int[26];
        for (int i = 0; i < N; i++) {
            freq[S.charAt(i) - 'A'] += 1;
        }

        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                cnt += 1;
            }
        }
        if (cnt > 1)
            return "NO SOLUTION";

        int left = 0, right = N - 1;
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 1) {
                ans[left++] = ans[right--] = (char) ('A' + i);
                freq[i] -= 2;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] == 1) {
                ans[N / 2] = (char) ('A' + i);
                break;
            }
        }

        return new String(ans);
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(solve(s));
        scanner.close();
    }
}


