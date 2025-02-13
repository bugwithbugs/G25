package Lecture25_Feb13_BinarySearchAsst;

import java.util.Arrays;

public class AggressiveCows {
    
    static boolean isPossible (int[] arr, int cows, int minDistance) {

        int n = arr.length;
        int lastStall = arr[0];
        int cnt = 1;

        for(int i = 1; i < n; i++){
            if(arr[i] - lastStall >= minDistance){
                cnt++;
                lastStall = arr[i];
            }
        }

        return cnt >= cows;

    }

    static int binarySearch(int[] arr, int cows) {

        int n = arr.length;
        Arrays.sort(arr);

        int low = 1;
        int high = arr[n-1] - arr[0];

        int ans = 1; 

        while (low <= high) {
            int mid = low + (high - low)/2;

            if(isPossible(arr, cows, mid)){
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 4, 8};
        int cows = 3;

        System.out.println(binarySearch(arr, cows));
    }
}
