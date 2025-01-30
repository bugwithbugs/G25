package Lecture12_Jan14_QuickSortAlgorithm;

import java.util.Scanner;

public class QuickSort {

    //using the same function placeTargetElement as discussed in previous question 
    static int getPivotIndex(int[] arr, int low, int high){
        int target_index = high; // randomize it for best average case time complexity
        int target = arr[target_index];
       
        int cnt = low; //since low is the very first element for this range
        
        // it's equal to high, as we're initializing the high as n-1 in main
        for(int i = low; i <= high; i++){ 
            if(arr[i] <= target){
                int temp = arr[cnt];
                arr[cnt] = arr[i];
                arr[i] = temp;
                cnt++;
            }    
        }

        //this will be the index of pivot (target element)
        return cnt - 1;
    }

    static void quickSort(int[] arr, int low, int high){
        if(low>=high)
        return;

        int pivot_index = getPivotIndex(arr, low, high);

        quickSort(arr, low, pivot_index - 1);
        quickSort(arr, pivot_index + 1, high);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int low = 0, high = n-1;
        quickSort(arr, low, high);

        for(int i: arr)
        System.out.print(i+" ");

        input.close();
    }
}
