package Lecture46_Apr10_BinarySearchQuestions;

public class Leetcode278 {

    // directly submit on Leetcode
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid overflow
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left; // First bad version [1][2]
    }
}
