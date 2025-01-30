package Lecture04_Dec09_Arrays;

import java.util.Scanner;

public class TakeInputUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variable
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        //array
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //for-each loop
        for(int i: arr)
        System.out.print(i + " ");

        sc.close();
    }
}
