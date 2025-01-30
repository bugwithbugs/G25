package Lecture06_Dec12_TicTacToe;

import java.util.Scanner;

public class TicTacToe {

    static int checkHorizontalRows (int[][] arr, int n){
      
        for(int i = 0; i < n; i++){
            int cnt = 0;
            int first = arr[i][0];
            for(int j = 0; j < n; j++)
                if(arr[i][j] == first)
                    cnt++;
            

            if(cnt == n){
                return first;
            }
        }

        return -1;
    }

    static int checkVerticalColumns (int[][] arr, int n){
       
        for(int i = 0; i < n; i++){
            int cnt = 0;
            int first = arr[0][1];
            for(int j = 0; j < n; j++)
                if(arr[j][i] == first)
                    cnt++;

            if(cnt == n){
                return first;
            }
        }

        return -1;
    }

    static int checkDiagonals(int[][] arr, int n){

        //for first diagonal
        int first = arr[0][0], cntFirst = 0;

        //for second diagonal
        int second = arr[0][n-1], cntSecond = 0;

        for(int i = 0; i < n; i++){
            
            //for first diagonal, i == j
            if(arr[i][i] == first)
                cntFirst ++;

            //for second diagonal, i + j == n - 1 => j = n - i - 1
            if(arr[i][n-i-1] == second)
                cntSecond ++;
        }

        if(cntFirst == n)
            return first;

        if(cntSecond == n)
            return second;

        return -1;
    }

    static void printWinner (int winner) {
        System.out.println("Winner: " + winner);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // taking 'O' as 0 & 'X' as 1;
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt(); 
                
        
        sc.close();
        
        //check row
        int winner = checkHorizontalRows(arr, n);
        if(winner != -1){
            printWinner(winner);
            return;
        }

        //check columns
        winner = checkVerticalColumns(arr, n);
        if(winner != -1){
            printWinner(winner);
            return;
        }

        //check diagonals
        winner = checkDiagonals(arr, n);
        if(winner != -1){
            printWinner(winner);
            return;
        }
    }
}
