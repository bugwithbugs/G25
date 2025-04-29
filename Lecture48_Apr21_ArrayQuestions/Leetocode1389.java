package Lecture48_Apr21_ArrayQuestions;

public class Leetocode1389 {
    // directly submit on Leetcode
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            targetList.add(index[i], nums[i]);
        }
        return targetList.stream().mapToInt(Integer::intValue).toArray();
    }
}
