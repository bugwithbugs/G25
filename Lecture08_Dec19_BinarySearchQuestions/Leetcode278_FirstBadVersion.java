package Lecture08_Dec19_BinarySearchQuestions;

//Leetcode - 278
public class Leetcode278_FirstBadVersion {

    // it's just a dummy implementation
    static boolean isBadVersion(int n) {

        return true;
    }

    // completing the leetcode function
    int firstBadVersion(int n) {
        int low = 1, high = n, ans = -1;
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return ans;
    }
}
