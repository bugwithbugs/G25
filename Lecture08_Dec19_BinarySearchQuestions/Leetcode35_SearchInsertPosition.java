package Lecture08_Dec19_BinarySearchQuestions;

//Leetcode - 35
public class Leetcode35_SearchInsertPosition {
    
    //Leetcode function implementation
    public int searchInsert(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

}
