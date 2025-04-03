package Lecture33_Mar10_CSES1;
import java.util.Scanner;
 
public class Repetitions {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String dna = sc.next();
            char currentChar = dna.charAt(0);
            int currentCount = 1;
            int maxCount = 1;
            for (int i = 1; i < dna.length(); i++) {
                if (dna.charAt(i) == currentChar) {
                    currentCount++;
                } else {
                    maxCount = Math.max(maxCount, currentCount);
                    currentChar = dna.charAt(i);
                    currentCount = 1;
                }
            }
            maxCount = Math.max(maxCount, currentCount);
            System.out.println(maxCount);
        }
    }
}