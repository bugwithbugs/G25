package Sorting.MergeSort;

import java.util.Scanner;

public class MergeSortAlgorithm {

    static void merge(int[] arr, int low, int mid, int high){

        int n = mid-low+1, m = high-mid;
        
        int[] leftArr = new int[n];
        int[] rightArr = new int[m];
        
        // Copying the data from original array
        for (int i = 0; i < n; i++) 
            leftArr[i] = arr[low + i];
        
        for (int j = 0; j < m; j++) 
            rightArr[j] = arr[mid + 1 + j];
            
        int i = 0, j = 0, k = low;
        while (i < n && j < m) 
            if(leftArr[i] <= rightArr[j])
                arr[k++] = leftArr[i++];
            else 
                arr[k++] = rightArr[j++];

        while (i < n) 
            arr[k++] = leftArr[i++];
        

        while (j < m) 
            arr[k++] = rightArr[j++];
        
    }

    static void mergeSort(int[] arr, int low, int high){
        if(low>=high)
        return;

        int mid = (low + high)/2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }

        mergeSort(a, 0, n-1);

        for(int i: a)
        System.out.print(i + " ");

    }
}
