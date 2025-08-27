package chapter10_array;

import java.util.Arrays;

public class Code10_04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("기존 배열의 길이 : " + arr.length);
        System.out.print("기존 배열 : ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        // copyOf
        arr = Arrays.copyOf(arr, arr.length+ 2);
        System.out.println("새 배열의 길이 : " + arr.length);
        System.out.print("새 배열 : ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
