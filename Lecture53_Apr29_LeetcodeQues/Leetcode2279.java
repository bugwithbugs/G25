import java.util.Arrays;

class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int[] rem = new int[n];
        for (int i = 0; i < n; i++) {
            rem[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(rem);
        int fullBags = 0;
        for (int r : rem) {
            if (r == 0) {
                fullBags++;
            } else if (additionalRocks >= r) {
                additionalRocks -= r;
                fullBags++;
            } else {
                break;
            }
        }
        return fullBags;
    }
}
