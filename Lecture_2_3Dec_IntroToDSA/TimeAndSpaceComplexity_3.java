package Lecture_2_3Dec_IntroToDSA;

import java.util.Scanner;

public class TimeAndSpaceComplexity_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int sum = 0;

        //Time Complexity: O(n) - Linear
        //Space Complexity: O(1) - Constant
        for(int i = 0; i < n; i++){
            sum += i;
        }

        //Time Complexity: O(n) - Linear
        //Space Complexity: O(1) - Constant
        for(int i = 0; i < n/2; i++){
            sum += i;
        }

        //Time Complexity: O(n) - Linear
        //Space Complexity: O(1) - Constant
        for(int i = 0; i < 2*n; i++){
            sum += i;
        }

        //Time Complexity: O(n*m) - Quadratic
        //Space Complexity: O(1) - Constant
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sum += j;
            }
        }

        //Time Complexity: O(logn) - Logarithmic (logn base 2)
        //Space Complexity: O(1) - Constant
        while (n > 0) {
            n /= 2;
        }

        //Time Complexity: O(logn) - Logarithmic (logn base k)
        //Space Complexity: O(1) - Constant
        int k = 4;
        while (n > 0) {
            n /= k;
        }

        //Time Complexity: O(nlogn) - Logarithmic (nlogn base 2)
        //Space Complexity: O(1) - Constant
        for(int i = 0; i < m; i++){ 
            while (n > 0) {
                n /= 2;
            }
        }

        System.out.println(sum);

        sc.close();
    }
}
