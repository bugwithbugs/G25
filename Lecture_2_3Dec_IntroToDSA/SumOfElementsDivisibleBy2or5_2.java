package Lecture_2_3Dec_IntroToDSA;

import java.util.Scanner;
public class SumOfElementsDivisibleBy2or5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0 || arr[i] % 5 == 0) {
                sum += arr[i];
            }
        }

        System.out.println("Sum of elements divisible by 2 or 5: " + sum);
    }

}