package Lecture48_Apr21_ArrayQuestions;

public class Leetcode3162 {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int n = nums1.length, m = nums2.length;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(nums1[i] % (nums2[j] * k) == 0)
                cnt++;
            }
        }   

        return count;
    }
}
