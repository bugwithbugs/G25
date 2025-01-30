package Lecture04_Dec09_Arrays;

import java.util.Scanner;

public class InsertInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int index = sc.nextInt();    
        int value = sc.nextInt();    
        
        // logic start here
        for(int i = n - 1; i > index; i--){
            arr[i] = arr[i-1];
        }

        arr[index] = value;
        for(int i: arr)
        System.out.print(i + " ");

        sc.close();
    }
}
