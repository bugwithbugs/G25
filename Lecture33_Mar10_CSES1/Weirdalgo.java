package Lecture33_Mar10_CSES1;
import java.util.*;
public class Weirdalgo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();
            System.out.print(n+" ");
            while (n>1){
                if (n%2==0){
                    n=n/2;
                    System.out.print(n+" ");
                }
                else{
                    n=(n*3)+1;
                    System.out.print(n+" ");
                }
            }
        }
    }
}
