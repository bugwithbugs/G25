package Lecture48_Apr21_ArrayQuestions;

public class Leetcode3467 {
    public int[] transformArray(int[] nums) {
        int n = nums.length, int even = 0;
        for(int i = 0; i < n; i++)
        if(nums[i]%2 == 0)
        even++;

        int[] ans = new int[n];
        for(int i = 0; i < even; i++)
        ans[i] = 0;

        for(int i = even; i < n; i++)
        ans[i] = 1;

        return ans;
    }

}
