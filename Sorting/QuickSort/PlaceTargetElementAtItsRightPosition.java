package Sorting.QuickSort;

import java.util.Scanner;

public class PlaceTargetElementAtItsRightPosition {

    static void placeTargetElement(int[] arr, int target_index){
        int n = arr.length;
        int target = arr[target_index];
        int cnt = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] <= target){
                int temp = arr[cnt];
                arr[cnt] = arr[i];
                arr[i] = temp;
                cnt++;
            }    
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int target_index = input.nextInt();

        placeTargetElement(arr, target_index);

        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
