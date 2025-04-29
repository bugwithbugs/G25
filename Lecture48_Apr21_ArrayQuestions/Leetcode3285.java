package Lecture48_Apr21_ArrayQuestions;

public class Leetcode3285 {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> ans = new ArrayList<>();
        int n = height.length;

        for (int i = 1; i < n; i++) {
            if (height[i - 1] > threshold)
                ans.add(i);
        }

        return ans;
    }
}
