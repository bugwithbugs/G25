package Lecture05_Dec10_2DArray_Question;

import java.util.Scanner;

public class FindElementZeroIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        for(int i = 0; i < rows; i++)
            for(int j = 0; j < columns; j++)
                arr[i][j] = sc.nextInt();  
        
        // use another loop for logic, don't write logic while taking input
        for(int i = 1; i + 1 < rows; i++){
            for(int j = 1; j + 1< columns; j++)
                if(arr[i][j] == 0){
                    if(arr[i][j-1] == 1 
                        && arr[i][j+1] == 1 
                        && arr[i-1][j] == 1
                        && arr[i+1][j] == 1 ){
                            System.out.println(i + " " + j);
                            break;
                    }
                }
            
        }

        sc.close();

    }
}
