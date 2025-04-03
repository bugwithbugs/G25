package Lecture34_Mar11_CSES2;
import java.io.*;

public class Twosets {
    public static void TwoSets(int n) throws IOException {
        long totalSum = (1L * n * (n + 1)) / 2;
        if (totalSum % 2 != 0) {
            System.out.println("NO");
            return;
        }

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        out.write("YES\n");

        boolean[] used = new boolean[n + 1];
        int set1Size = 0, set2Size = 0;
        long halfSum = totalSum / 2;

        for (int i = n; i > 0; i--) {
            if (halfSum >= i) {
                used[i] = true;
                halfSum -= i;
                set1Size++;
            } else {
                set2Size++;
            }
        }

        out.write(set1Size + "\n");
        for (int i = 1; i <= n; i++) {
            if (used[i]) out.write(i + " ");
        }
        out.write("\n");

        out.write(set2Size + "\n");
        for (int i = 1; i <= n; i++) {
            if (!used[i]) out.write(i + " ");
        }
        out.write("\n");

        out.flush();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        TwoSets(n);
    }
}
