package Sorting.MergeSort;

import java.util.Scanner;

public class MergeSortedArrays {
    static int[] mergeSortedArrays(int[] a, int[] b, int n, int m){
        int[] c = new int[n+m];
        int i = 0, j = 0, k = 0;
        
        while (i < n && j < m) {
            if(a[i] <= b[j])
                c[k++] = a[i++];
            else 
                c[k++] = b[j++];
        } 

        while (i < n) 
            c[k++] = a[i++];
        

        while (j < m) 
            c[k++] = b[j++];
        

        return c;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        
        int m = input.nextInt();
        int[] b = new int[m];

        for(int i = 0; i < m; i++){
            b[i] = input.nextInt();
        }

        int[] c = mergeSortedArrays(a, b, n, m);

        for(int i: c)
            System.out.print(i + " ");
    }
}