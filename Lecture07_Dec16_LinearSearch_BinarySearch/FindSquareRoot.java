package Lecture07_Dec16_LinearSearch_BinarySearch;

import java.util.Scanner;

public class FindSquareRoot {

    public static int findSquareRoot(int number) {
        int left = 0;
        int right = number;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (mid * mid == number) 
                return mid;
            
            else if (mid * mid < number) 
                left = mid + 1;
            
            else 
                right = mid - 1;
        }

        return -1;
    }

    //BONUS : use this function for finding the square root.
    //Time complexity: O(logn)
    static int findFloorOfSquareRoot (int number){
        int left = 0;
        int right = number;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (mid * mid == number) 
                return mid;
            
            else if (mid * mid < number) 
                left = mid + 1;
            
            else 
                right = mid - 1;
        }

        //right will point to the largest integer whose square is <= number 
        return right;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        

        int number = scanner.nextInt();

        int squareRoot = findSquareRoot(number);

        if(squareRoot == -1)
            System.out.println(number + " is not a prefect square, \nFloor value of " + number + ": " + findFloorOfSquareRoot(number));
        else
            System.out.println("Square root: " + squareRoot);
        
        scanner.close();
    }
}
