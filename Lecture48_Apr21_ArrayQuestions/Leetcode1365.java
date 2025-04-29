package Lecture48_Apr21_ArrayQuestions;

public class Leetcode1365 {
    // directly submit on Leetcode
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[102];
        for (int num : nums) {
            ++count[num + 1];
        }
        for (int i = 1; i < count.length; ++i) {
            count[i] += count[i - 1];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            result[i] = count[nums[i]];
        }
        return result;
    }
}