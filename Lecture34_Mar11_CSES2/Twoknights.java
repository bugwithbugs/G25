package Lecture34_Mar11_CSES2;
import java.util.Scanner;
 
public class Twoknights {
    private static final int[][] MOVES = {{1,2}, {1,-2}, {-1,2}, {-1,-2}, {2,1}, {2,-1}, {-2,1}, {-2,-1}};
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for (int k = 1; k <= n; k++) {
            long nonAttackingPlacements = countNonAttackingKnights(k);
            System.out.println(nonAttackingPlacements);
        }
    }
    public static long countNonAttackingKnights(int k) {
        if (k < 2) return 0;
        long totalPositions = (long) k * k;
        long totalPlacements = (totalPositions * (totalPositions - 1)) / 2;
        long attackingPairs = 0;
        for (int[] move : MOVES) {
            int dx = move[0], dy = move[1];
            attackingPairs += (k - Math.abs(dx)) * (k - Math.abs(dy));
        }
        attackingPairs /= 2;
        return totalPlacements - attackingPairs;
    }
}