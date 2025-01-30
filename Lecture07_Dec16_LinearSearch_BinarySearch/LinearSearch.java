package Lecture07_Dec16_LinearSearch_BinarySearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,7,5,3,8,10};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 8 == 0){
                System.out.println(i);
                return;
            }
        }

        System.out.println("Element divisible by 8 not found.");
    }
}
