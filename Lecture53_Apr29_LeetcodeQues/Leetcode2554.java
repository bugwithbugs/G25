import java.util.HashSet;

class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> banSet = new HashSet<>();
        for (int b : banned) banSet.add(b);
        int count = 0, sum = 0;
        for (int i = 1; i <= n; i++) {
            if (banSet.contains(i)) continue;
            if (sum + i > maxSum) break;
            sum += i;
            count++;
        }
        return count;
    }
}
