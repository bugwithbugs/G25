import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // Sort boxTypes by units per box in descending order
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

        int maxUnits = 0;
        for (int[] boxType : boxTypes) {
            int boxes = boxType[0];
            int unitsPerBox = boxType[1];
            int boxesToLoad = Math.min(truckSize, boxes);
            maxUnits += boxesToLoad * unitsPerBox;
            truckSize -= boxesToLoad;
            if (truckSize == 0) break;
        }
        return maxUnits;
    }
}
